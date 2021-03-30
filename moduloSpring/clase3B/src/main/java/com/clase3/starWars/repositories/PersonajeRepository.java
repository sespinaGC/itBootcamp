package com.clase3.starWars.repositories;

import com.clase3.starWars.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeRepository {
    List<PersonajeDTO> findPersonajeByName(String name);
}
