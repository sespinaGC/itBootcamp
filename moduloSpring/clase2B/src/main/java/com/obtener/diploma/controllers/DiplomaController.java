package com.obtener.diploma.controllers;

import com.obtener.diploma.dto.AlumnoDTO;
import com.obtener.diploma.dto.DiplomaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiplomaController {

    @PostMapping("/alumno")
    public ResponseEntity generarDiploma(@RequestBody AlumnoDTO alumno) {
        return new ResponseEntity(new DiplomaDTO(alumno.getNombre(), alumno.getAsignAprobadas()), HttpStatus.OK);
    }

}
