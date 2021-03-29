package com.obtener.diploma.dto;

import com.obtener.diploma.services.PromedioNotas;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class AlumnoDTO {
    private String nombre;
    private HashMap<String, Double> asignAprobadas;
}
