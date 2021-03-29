package com.clase2A.m2.services;

import com.clase2A.m2.dto.HabitacionDTO;

import java.util.ArrayList;

public class HabitacionMasGrande {

    public static HabitacionDTO obtenerMasGrande(ArrayList<HabitacionDTO> habitaciones) {
        double areaGrande = 0;
        HabitacionDTO habMasGrande = null;
        for(HabitacionDTO hab : habitaciones) {
            if(hab.areaHabitacion() > areaGrande) {
                areaGrande = hab.areaHabitacion();
                habMasGrande = hab;
            }
        }
        return habMasGrande;
    }
}
