package com.example.microservizioarticolo.restController;


import com.example.microservizioarticolo.dto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.recensioneClient.RecensioneClient;
import com.example.microservizioarticolo.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/articolo")
public class ArticoloRestController {

    @Autowired
    ArticoloService articoloService;

    @Autowired
    RecensioneClient recensioneClient;






    @PostMapping(value = "/creaArticolo")
    public void saveNewArticolo(@RequestBody Articolo articolo,@RequestParam Long idRecensione){

        String nomerecensione = recensioneClient.getArticoloRecensioneById(idRecensione);
        articolo.setArticoloRecensione(nomerecensione);
        articolo.setIdRecensione(idRecensione);
        articoloService.saveArticolo(articolo);
        System.out.println("Articolo salvato");
    }

    @GetMapping(value="/listaArticoli")
    public List<ArticoloDto> getArticolo(){

        return articoloService.findAll();

    }

    @DeleteMapping(value="eliminaArticolo")
    public String deleteArticolo(@RequestParam Long id){

        articoloService.deleteById(id);
        return "Articolo eliminato";
    }
    @PutMapping(value="modificaArticolo")
    public String updateArticolo(@RequestBody Articolo articolo){

        if((Object)articoloService.findById(articolo.getId())!=null && articolo.getId()!=null)
            articoloService.save(articolo);
        return "Articolo modificato";
    }
}
