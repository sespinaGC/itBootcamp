package com.clase3.starWars.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonajeDTO {
    private String name, hair_color, homeworld, species, gender, skin_color, eye_color, birth_year, height, mass;
}
