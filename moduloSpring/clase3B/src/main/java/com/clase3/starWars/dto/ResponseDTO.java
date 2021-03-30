package com.clase3.starWars.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private List<PersonajeDTO> personajes;
}
