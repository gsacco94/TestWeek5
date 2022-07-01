package com.example.microservizioarticolo.service;



import com.example.microservizioarticolo.converter.ArticoloConverter;
import com.example.microservizioarticolo.dto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.repository.ArticoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ArticoloServiceImpl implements ArticoloService {

    @Autowired
    ArticoloRepository articoloRepository;

    @Autowired
    ArticoloConverter articoloConverter;


    @Override
    public void saveArticolo(Articolo articolo) {
        articoloRepository.save(articolo);
    }

    @Override
    public List<ArticoloDto> findAll() {
        List<Articolo> articoli=articoloRepository.findAll();
        return articoloConverter.converterArticolo(articoli);
    }

    @Override
    public void deleteById(Long id) {
        articoloRepository.deleteById(id);
    }

    @Override
    public Optional<Articolo> findById(Long id) {
        return articoloRepository.findById(id);
    }

    @Override
    public void save(Articolo articolo) {
        articoloRepository.save(articolo);
    }


}
