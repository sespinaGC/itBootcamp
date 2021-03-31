package com.example.demo.repositories;

import com.example.demo.dto.LinkDTO;
import com.example.demo.exceptions.SecurityException;
import com.example.demo.exceptions.UriSyntaxException;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Repository
public class LinkTrackerRepositoryImpl implements LinkTrackerRepository{
    private static final String URL_REGEX =
            "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))" +
                    "(%{2}|[-()_.!~*';/?:@&=+$, A-Za-z0-9])+)" + "([).!';/?:, ][[:blank:]])?$";

    private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

    private AtomicInteger contadorId = new AtomicInteger(1);

    private Map<Integer, LinkDTO> listURL;

    public LinkTrackerRepositoryImpl() {
        this.listURL = new HashMap<>();
    }

    public static boolean urlValidator(String url)
    {
        if (url == null) {
            return false;
        }
        Matcher matcher = URL_PATTERN.matcher(url);
        return matcher.matches();
    }

    @Override
    public Integer addLink(String url, String pwd) throws UriSyntaxException {

        if(urlValidator(url)) {
            if(pwd.equals("")) {
                listURL.put(contadorId.get(), new LinkDTO(url));
            } else {
                listURL.put(contadorId.get(), new LinkDTO(url, pwd));
            }
            return contadorId.getAndIncrement();
        } else {
            throw new UriSyntaxException("La URL: " + url + " no es valida");
        }
    }

    @Override
    public String searchLink(Integer linkId, String pwd) throws SecurityException {
        LinkDTO linkDTO = listURL.get(linkId);

        if(linkDTO.isValid()){
            if (linkDTO.getPassword().equals("") || linkDTO.getPassword().equals(pwd)) {
                linkDTO.setContador(linkDTO.getContador() + 1);
                return listURL.get(linkId).getUrl();
            } else {
                throw new SecurityException(linkDTO.getUrl() + " a password is required!");
            }
        } else {
            throw new SecurityException(linkDTO.getUrl() + " is protected!");
        }
    }

    @Override
    public LinkDTO getMetrics(Integer linkId) {
        return listURL.get(linkId);
    }

    @Override
    public LinkDTO invalidateLink(Integer linkId) {
        listURL.get(linkId).setValid(false);
        return listURL.get(linkId);
    }
}
