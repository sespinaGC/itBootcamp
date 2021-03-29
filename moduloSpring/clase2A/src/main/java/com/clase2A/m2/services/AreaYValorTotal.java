package com.clase2A.m2.services;

import com.clase2A.m2.dto.AreaTotalDTO;
import com.clase2A.m2.dto.HabitacionDTO;

import java.util.ArrayList;

public class AreaYValorTotal {
    public static AreaTotalDTO obtenerAreaTotal(ArrayList<HabitacionDTO> habitaciones) {
        double areaTotal = 0;
        double valorCasa = 0;
        for(HabitacionDTO hab : habitaciones) {
            areaTotal += hab.areaHabitacion();
        }
        valorCasa = areaTotal * 800;
        return new AreaTotalDTO(areaTotal, valorCasa);
    }
}
