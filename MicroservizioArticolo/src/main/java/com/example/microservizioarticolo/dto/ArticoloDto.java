package com.example.microservizioarticolo.dto;

import lombok.Data;

@Data
public class ArticoloDto {
    private String nomeArticolo;
    private String prezzoArticolo;

    private String articoloRecensione;



    public String getNomeArticolo() {
        return nomeArticolo;
    }


}
