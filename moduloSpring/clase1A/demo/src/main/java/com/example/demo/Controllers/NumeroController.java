package com.example.demo.Controllers;

import com.example.demo.Entities.Numero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numero")
public class NumeroController {

    @GetMapping("/convertir")
    public Numero convertirARomano(@RequestParam(value = "number", defaultValue = "1") String number) throws Exception{

        int n = Integer.parseInt(number);
        Numero nObject = new Numero(n);
        nObject.convertirARomano();
        return nObject;


    }
}
