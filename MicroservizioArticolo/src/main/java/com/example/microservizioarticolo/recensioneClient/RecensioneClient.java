package com.example.microservizioarticolo.recensioneClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "recensione", url = "http://localhost:8087/api/recensione")
public interface RecensioneClient {

    @GetMapping(value = "/getArticoloRecensioneById")
    public String getArticoloRecensioneById(@RequestParam Long id);


}