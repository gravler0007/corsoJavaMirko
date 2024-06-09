package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class RicettaController {
    
    @Autowired
    private RicettaService ricettaService;

    @GetMapping 
    public String getAllFrutti(Model model) {
        model.addAttribute("ricetteList", ricettaService.findAll());
        return "Home";
    }

    @GetMapping("/aggiungi")
    public String mostraFormAggiungiRicette(Ricetta ricetta) {
    return "Aggiungi";
    }


    @PostMapping("/aggiungi")
    public String salvaRicetta(Ricetta ricetta) {
        ricettaService.save(ricetta);
        return "redirect:/";
    }

    @GetMapping("/elimina")
    public String mostraFormEliminaRicette() {
        return "Elimina";
    }

    @PostMapping("/elimina")
    public String eliminaRicetta(@RequestParam Long id) {
        ricettaService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/elimina2")
    public String mostraFormEliminaRicette2() {
        return "Elimina2";
    }


    // Con questa configurazione, quando un utente invia una richiesta DELETE a
    // /ricette/{id}, il controller Spring chiamerà il metodo
    // eliminaRicettaByApiFetch e
    // passerà l'ID della ricetta da eliminare. Il servizio RicettaService quindi
    // eliminerà la ricetta corrispondente dal database.
    @DeleteMapping("/elimina2/{id}")
    public ResponseEntity<Void> eliminaRicettaByApiFetch(@PathVariable Long id) {
        Optional<Ricetta> ricetta = ricettaService.findById(id);// @PathVariable è un'annotazione in Spring MVC che viene utilizzata per mappare parte dell'URL di una richiesta HTTP a un parametro di un metodo di gestione della richiesta.
        if (ricetta.isPresent()) {
            ricettaService.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
    

    // @Autowired
    // private RicettaRepository ricettaRepository;

    // //localhost:8080/
    // @GetMapping("/")
    // public String mostraRicetta(Model model) {
    //     List<Ricetta> ricette = ricettaRepository.findAll();
    //     model.addAttribute("ricetteList", ricette);
    //     return "Home";
    // }

    // @GetMapping("/aggiungi")
    // public String mostraFormAggiungiRicette(Ricetta ricetta) {
    //     return "Aggiungi";
    // }
    
    // @PostMapping("/aggiungi")
    // public String salvaRicetta(Ricetta ricetta) {
    //     ricettaRepository.save(ricetta);
    //     return "redirect:/";
    // }
    
}
