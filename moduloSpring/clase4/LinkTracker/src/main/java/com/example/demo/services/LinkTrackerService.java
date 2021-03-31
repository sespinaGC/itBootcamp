package com.example.demo.services;

import com.example.demo.dto.LinkDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.exceptions.SecurityException;
import com.example.demo.exceptions.UriSyntaxException;
import org.springframework.http.HttpHeaders;

import java.net.URISyntaxException;

public interface LinkTrackerService {

    ResponseDTO createLink (String url, String pwd) throws UriSyntaxException;
    HttpHeaders redirectLink (Integer linkId, String pwd) throws URISyntaxException, UriSyntaxException, SecurityException;
    LinkDTO getMetrics(Integer linkId);
    LinkDTO invalidateLink(Integer linkId);
}
