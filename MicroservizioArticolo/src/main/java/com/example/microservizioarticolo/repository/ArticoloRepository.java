package com.example.microservizioarticolo.repository;

import com.example.microservizioarticolo.entity.Articolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ArticoloRepository extends JpaRepository<Articolo,Long> {

}