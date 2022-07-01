package com.example.microserviziorecensione.restController;

import com.example.microserviziorecensione.entity.Recensione;
import com.example.microserviziorecensione.service.RecensioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/recensione")
public class RecensioneRestController {

    @Autowired
    RecensioneService recensioneService;


    @GetMapping(value = "getArticoloRecensioneById")
    public String getArticoloRecensioneById(@RequestParam Long id) {

        return recensioneService.getArticoloRecensioneById(id);


    }
    @GetMapping(value="listaRecensioni")
    public List<Recensione> getRecensioni(){
        return recensioneService.findAll();
    }

    @PostMapping(value="creaRecensione")
    public String addRecensione(@RequestBody Recensione recensione){

        recensioneService.save(recensione);
        return "Recensione salvata";
    }

    @DeleteMapping(value="eliminaRecensione")
    public String deleteRecensione(@RequestParam Long id){

        recensioneService.deleteById(id);
        return "Recensione Eliminata";
    }

    @GetMapping(value="findRecensione")
    public Optional<Recensione> findRecensione(@RequestParam Long id){

        return recensioneService.findById(id);
    }

    @PutMapping(value="modificaRecensione")
    public String updateRecensione(@RequestBody Recensione recensione){

        if((Object)recensioneService.findById(recensione.getId())!=null && recensione.getId()!=null)
            recensioneService.save(recensione);
        return "Recensione modificata";
    }


}
