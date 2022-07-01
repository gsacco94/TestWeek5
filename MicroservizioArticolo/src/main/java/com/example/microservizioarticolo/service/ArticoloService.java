package com.example.microservizioarticolo.service;


import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.dto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;

import java.util.List;
import java.util.Optional;

public interface ArticoloService {
    void saveArticolo(Articolo articolo);

    void deleteById(Long id);

    List<ArticoloDto> findAll();
    Optional<Articolo> findById(Long id);
    void save(Articolo articolo);
}
