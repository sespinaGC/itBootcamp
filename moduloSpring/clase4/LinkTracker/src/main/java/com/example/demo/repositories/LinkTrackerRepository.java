package com.example.demo.repositories;


import com.example.demo.dto.LinkDTO;
import com.example.demo.exceptions.SecurityException;
import com.example.demo.exceptions.UriSyntaxException;

public interface LinkTrackerRepository {

    Integer addLink(String url, String pwd) throws UriSyntaxException;
    String searchLink(Integer linkId, String pwd) throws SecurityException;
    LinkDTO getMetrics(Integer linkId);
    LinkDTO invalidateLink(Integer linkId);
}
