package com.clase3.starWars.repositories;

import com.clase3.starWars.dto.PersonajeDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PersonajeRepositoryImpl implements PersonajeRepository{

    @Override
    public List<PersonajeDTO> findPersonajeByName(String name) {
        List<PersonajeDTO> personajeDTOs = null;
        List<PersonajeDTO> response = new ArrayList<>();
        personajeDTOs = loadDataBase();
        if (personajeDTOs != null){
            for(PersonajeDTO personajeDTO : personajeDTOs) {
                if(personajeDTO.getName().toLowerCase().contains(name)) {
                    response.add(personajeDTO);
                }
            }
        }

        return response.size() > 0 ? response : personajeDTOs;
    }

    private List<PersonajeDTO> loadDataBase() {
        File file = null;

        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        }catch (Exception e){
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PersonajeDTO>> typeRef = new TypeReference<List<PersonajeDTO>>() {};
        List<PersonajeDTO> personajeDTOs = null;

        try {
            personajeDTOs = objectMapper.readValue(file, typeRef);
        }catch (Exception e){
            e.printStackTrace();
        }

        return personajeDTOs;
    }
}
