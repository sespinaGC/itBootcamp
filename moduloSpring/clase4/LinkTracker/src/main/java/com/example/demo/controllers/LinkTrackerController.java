package com.example.demo.controllers;

import com.example.demo.dto.ErrorDTO;
import com.example.demo.dto.LinkDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.exceptions.SecurityException;
import com.example.demo.exceptions.UriSyntaxException;
import com.example.demo.services.LinkTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
public class LinkTrackerController {

    @Autowired
    private LinkTrackerService linkTrackerService;

    //instanciar un LinkDTO y agregarlo al Hashmap. Validar URL
    @PostMapping("/")
    public ResponseEntity<ResponseDTO> createLink(@RequestBody LinkDTO url, @RequestParam(defaultValue = "") String pwd) throws UriSyntaxException {

        return new ResponseEntity<>(linkTrackerService.createLink(url.getUrl(), pwd), HttpStatus.OK);
    }

    //Buscar en el hashmap y validar el status el link y hacer toda la logica de redireccion y aumentar el contador
    @GetMapping("/link/{linkId}")
    public ResponseEntity<HttpHeaders> redirectLink(@PathVariable Integer linkId, @RequestParam(defaultValue = "") String pwd) throws URISyntaxException, UriSyntaxException, SecurityException {
            return new ResponseEntity<>(linkTrackerService.redirectLink(linkId, pwd), HttpStatus.SEE_OTHER);
    }

    //Buscar en el hashmap y devolver el contador
    @GetMapping("/metrics/{linkId}")
    public ResponseEntity<LinkDTO> getMetrics(@PathVariable Integer linkId){

        return new ResponseEntity<>(linkTrackerService.getMetrics(linkId), HttpStatus.OK);
    }

    //Buscar en el hashmap y cambiar el status del link
    @PostMapping("/invalidate/{linkId}")
    public ResponseEntity<LinkDTO> invalidateLink(@PathVariable Integer linkId){
        return new ResponseEntity<>(linkTrackerService.invalidateLink(linkId), HttpStatus.OK);
    }

    @ExceptionHandler(value={UriSyntaxException.class})
    public ResponseEntity<ErrorDTO> uriSyntaxException(Exception e){
        ErrorDTO errorDTO = new ErrorDTO("Invalid URI", e.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value={SecurityException.class})
    public ResponseEntity<ErrorDTO> securityException(Exception e){
        ErrorDTO errorDTO = new ErrorDTO("URI protected", e.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.UNAUTHORIZED);
    }
}
