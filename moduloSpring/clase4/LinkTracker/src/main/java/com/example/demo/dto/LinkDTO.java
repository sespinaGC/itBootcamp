package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkDTO {

    private String url, password;
    private boolean valid;
    private Integer contador;

    public LinkDTO(String url){
        this.url = url;
        contador = 0;
        valid = true;
        password = "";
    }

    public LinkDTO(String url, String password) {
        this.url = url;
        this.password = password;
        contador = 0;
        valid = true;
    }
}
