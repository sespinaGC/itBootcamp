package com.clase3.starWars.services;

import com.clase3.starWars.dto.PersonajeDTO;
import com.clase3.starWars.dto.ResponseDTO;
import com.clase3.starWars.repositories.PersonajeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class PersonajeServiceImpl implements PersonajeService{

    private PersonajeRepository personajeRepository;

    public PersonajeServiceImpl(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    public ResponseDTO getResponse(String name) {
        return new ResponseDTO(obtenerPersonajes(name));
    }

    @Override
    public List<PersonajeDTO> obtenerPersonajes(String name) {
        return personajeRepository.findPersonajeByName(name);
    }
}
