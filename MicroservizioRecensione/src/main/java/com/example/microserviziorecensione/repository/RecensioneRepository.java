package com.example.microserviziorecensione.repository;


import com.example.microserviziorecensione.entity.Recensione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecensioneRepository extends JpaRepository<Recensione, Long> {


}
