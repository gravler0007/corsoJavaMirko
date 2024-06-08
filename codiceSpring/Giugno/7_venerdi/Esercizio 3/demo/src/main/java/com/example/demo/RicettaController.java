package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class RicettaController {

    @Autowired
    private RicettaRepository ricettaRepository;

    @GetMapping("/")
    public List<Ricetta> getAllRicette() {
        return ricettaRepository.findAll();
    }

    @PostMapping("/aggiungi")
    public Ricetta salvaRicetta(@RequestBody Ricetta entity) {
        return ricettaRepository.save(entity);
    }
}