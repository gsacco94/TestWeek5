package com.example.microserviziorecensione.service;

import com.example.microserviziorecensione.entity.Recensione;

import java.util.List;
import java.util.Optional;

public interface RecensioneService {
    String getArticoloRecensioneById(Long id);
    List<Recensione> getAllRecensioni();
    void save(Recensione recensione);
    void deleteById(Long id);
    Recensione getReferenceById(long id);
    Optional<Recensione> findById(Long id);

    public List<Recensione> findAll();
}
