package com.example.microservizioarticolo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Articolo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String nomeArticolo;
    @Column
    private String prezzoArticolo;
    @Column
    private Long idRecensione;
    @Column
    private String articoloRecensione;


}
