package com.clase2A.m2.dto;

import com.clase2A.m2.services.AreaYValorTotal;
import com.clase2A.m2.services.HabitacionMasGrande;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data

public class CasaDTO {
    private String nombre;
    private String direccion;
    private ArrayList<HabitacionDTO> habitaciones = new ArrayList<HabitacionDTO>();

    private AreaTotalDTO totales;
    private HabitacionDTO habMasGrande;

    public CasaDTO(String nombre, String direccion, ArrayList<HabitacionDTO> habitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        habMasGrande();
        areaTotalCasa();
    }

    public void habMasGrande() {
        this.habMasGrande = HabitacionMasGrande.obtenerMasGrande(habitaciones);
    }

    public void areaTotalCasa() {
        totales = AreaYValorTotal.obtenerAreaTotal(habitaciones);
    }
}
