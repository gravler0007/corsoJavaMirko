package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class RicettaController {
    
    @Autowired
    private RicettaRepository ricettaRepository;

    //localhost:8080/
    @GetMapping("/")
    public String mostraRicetta(Model model) {
        List<Ricetta> ricette = ricettaRepository.findAll();
        model.addAttribute("ricetteList", ricette);
        return "Home";
    }

    @GetMapping("/aggiungi")
    public String mostraFormAggiungiRicette(Ricetta ricetta) {
        return "Aggiungi";
    }
    
    @PostMapping("/aggiungi")
    public String salvaRicetta(Ricetta ricetta) {
        ricettaRepository.save(ricetta);
        return "redirect:/";
    }
    
}
