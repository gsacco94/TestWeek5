package com.example.microservizioarticolo.converter;


import com.example.microservizioarticolo.dto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ArticoloConverter {

    public List<ArticoloDto> converterArticolo(List<Articolo> articoli){

        List<ArticoloDto> listaDto=new ArrayList<ArticoloDto>();
        for(Articolo a: articoli){
            ArticoloDto a1=new ArticoloDto();
            a1.setNomeArticolo(a.getNomeArticolo());
            a1.setPrezzoArticolo(a.getPrezzoArticolo());
            a1.setArticoloRecensione(a.getArticoloRecensione());
            listaDto.add(a1);
        }
        return listaDto;
    }
}
