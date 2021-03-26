package com.example.morse.Controllers;

import com.example.morse.Entities.CodigoMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codigo")
public class CodigoMorseController {
    @GetMapping("/convertir/{codigo}")
    public CodigoMorse convertir(@PathVariable() String codigo){
        CodigoMorse codigoMorse = new CodigoMorse(codigo);
        codigoMorse.convertirCodigo();
        return codigoMorse;
    }
}
