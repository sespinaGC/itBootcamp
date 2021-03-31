package com.example.demo.services;

import com.example.demo.dto.LinkDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.exceptions.SecurityException;
import com.example.demo.exceptions.UriSyntaxException;
import com.example.demo.repositories.LinkTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class LinkTrackerServiceImpl implements LinkTrackerService{

    @Autowired
    private LinkTrackerRepository linkTrackerRepository;

    @Override
    public ResponseDTO createLink(String url, String pwd) throws UriSyntaxException {
        return new ResponseDTO(linkTrackerRepository.addLink(url, pwd));
    }

    @Override
    public HttpHeaders redirectLink(Integer linkId, String pwd) throws UriSyntaxException, SecurityException {
        String url = linkTrackerRepository.searchLink(linkId, pwd);
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uri);
        return httpHeaders;
    }

    @Override
    public LinkDTO getMetrics(Integer linkId) {
        return linkTrackerRepository.getMetrics(linkId);
    }

    @Override
    public LinkDTO invalidateLink(Integer linkId) {
        return linkTrackerRepository.invalidateLink(linkId);
    }
}
