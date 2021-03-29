package com.clase2A.m2.dto;

import com.clase2A.m2.services.AreaPorHabitacion;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class HabitacionDTO {
    private String nombre;
    private double ancho;
    private double largo;
    private double areaHab;

    public HabitacionDTO(String nombre, double ancho, double largo) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
    }

    public double areaHabitacion() {
        this.areaHab = AreaPorHabitacion.obtenerArea(ancho, largo);
        return this.areaHab;
    }
}
