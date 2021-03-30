package com.clase3.starWars.controller;

import com.clase3.starWars.services.PersonajeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarWarsController {

    private final PersonajeServiceImpl personajeService;

    public StarWarsController (PersonajeServiceImpl personajeService) {
        this.personajeService = personajeService;
    }

    @GetMapping("/personajes/{name}")
    public ResponseEntity obtenerPersonajes(@PathVariable String name) {
        return new ResponseEntity(personajeService.getResponse(name), HttpStatus.OK);
    }
}
