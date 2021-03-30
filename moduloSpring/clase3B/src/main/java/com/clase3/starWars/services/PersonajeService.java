package com.clase3.starWars.services;

import com.clase3.starWars.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeService {
    List<PersonajeDTO> obtenerPersonajes(String name);
}
