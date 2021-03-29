package com.clase2A.m2.controller;

import com.clase2A.m2.dto.CasaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/casa")
public class CasaController {
    @PostMapping()
    public ResponseEntity postearCasa (@RequestBody CasaDTO casaDTO) {
        return new ResponseEntity(casaDTO, HttpStatus.OK);
    }
}
