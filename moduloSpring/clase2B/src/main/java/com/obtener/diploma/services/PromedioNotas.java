package com.obtener.diploma.services;

import com.obtener.diploma.dto.DiplomaDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromedioNotas {
    public static double sacarPromedio(HashMap<String, Double> asignAprobadas) {
        double promedio = 0;
        for(Map.Entry<String, Double> entry : asignAprobadas.entrySet()) {
            promedio += entry.getValue();
        }
        promedio = promedio / asignAprobadas.size();
        return promedio;
    }
}
