package com.obtener.diploma.dto;

import com.obtener.diploma.services.PromedioNotas;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
public class DiplomaDTO {
    private String message = "Congratulations on finishing the class";
    private double promedio;
    private String nombre;

    public DiplomaDTO(String nombre, HashMap<String, Double> asignAprobadas) {
        this.nombre = nombre;
        this.promedio = PromedioNotas.sacarPromedio(asignAprobadas);
        if(promedio >= 9) message += ". We are very proud to present you with this diploma, good luck!";
    }
}
