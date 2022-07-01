package com.example.microserviziorecensione.service;

import com.example.microserviziorecensione.entity.Recensione;
import com.example.microserviziorecensione.repository.RecensioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RecensioneServiceImpl implements RecensioneService {


    @Autowired
   RecensioneRepository recensioneRepository;

    @Override
    public String getArticoloRecensioneById(Long id) {
        Recensione recensione = recensioneRepository.getReferenceById(id);
        return recensione.getArticoloRecensione();
    }
    @Override
    public List<Recensione> getAllRecensioni() {

        return recensioneRepository.findAll();
    }

    @Override
    public void save(Recensione recensione) {
        recensioneRepository.save(recensione);
    }

    @Override
    public void deleteById(Long id) {
        recensioneRepository.deleteById(id);
    }

    @Override
    public Recensione getReferenceById(long id){
        return recensioneRepository.getReferenceById(id);
    }

    @Override
    public Optional<Recensione> findById(Long id) {
        return recensioneRepository.findById(id);
    }

    @Override
    public List<Recensione> findAll(){
        return recensioneRepository.findAll();
    }
}
