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

    // Questo metodo gestisce la richiesta GET per ottenere tutte le ricette
    @GetMapping 
    public String getAllFrutti(Model model) {
        model.addAttribute("ricetteList", ricettaService.findAll());
        return "Home";
    }

    // Questo metodo gestisce la richiesta GET per mostrare il form di aggiunta delle ricette
    @GetMapping("/aggiungi")
        public String mostraFormAggiungiRicette(Ricetta ricetta) {
        return "Aggiungi";
    }

    // Questo metodo gestisce la richiesta POST per salvare una nuova ricetta
    @PostMapping("/aggiungi")
    public String salvaRicetta(Ricetta ricetta) {
        ricettaService.save(ricetta);
        return "redirect:/";
    }

    // Questo metodo gestisce la richiesta GET per mostrare il form di eliminazione delle ricette
    @GetMapping("/elimina")
    public String mostraFormEliminaRicette() {
        return "Elimina";
    }

    // Questo metodo gestisce la richiesta POST per eliminare una ricetta
    @PostMapping("/elimina")
    public String eliminaRicetta(@RequestParam Long id) {
        ricettaService.deleteById(id);
        return "redirect:/";
    }

    // Questo metodo gestisce la richiesta GET per mostrare un secondo form di eliminazione delle ricette
    @GetMapping("/eliminaByFetch")
    public String mostraFormEliminaRicette2() {
        return "EliminaByFetch";
    }


    // Questo metodo gestisce la richiesta DELETE per eliminare una ricetta tramite API Fetch

    // Con questa configurazione, quando un utente invia una richiesta DELETE a /ricette/{id}, il controller Spring 
    // chiamerà il metodo eliminaRicettaByApiFetch e passerà l'ID della ricetta da eliminare. 
    // Il servizio RicettaService quindi eliminerà la ricetta corrispondente dal database.
    @DeleteMapping("/eliminaByFetch/{id}")
    public ResponseEntity<Void> eliminaRicettaByApiFetch(@PathVariable Long id) {
        Optional<Ricetta> ricetta = ricettaService.findById(id);// @PathVariable è un'annotazione in Spring MVC che viene utilizzata per mappare parte dell'URL di una richiesta HTTP a un parametro di un metodo di gestione della richiesta.
        if (ricetta.isPresent()) {
            ricettaService.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    // Questo metodo gestisce la richiesta GET per mostrare un form che permette di trovare una ricetta by id
    @GetMapping("/trovaById")
    public String mostraFormTrovaRicette() {
        return "MostraRicetta";
    }

    // Gestisce la richiesta POST per trovare e mostrare una ricetta specifica per ID
    @PostMapping("/trovaById")
    public String trovaRicettaById(@RequestParam Long id, Model model) {
        Optional<Ricetta> ricettaOptional = ricettaService.findById(id);
        if (ricettaOptional.isPresent()) {
            Ricetta ricetta = ricettaOptional.get();
            model.addAttribute("ricetta", ricetta);
            return "MostraRicetta"; // Ritorna la vista (file html) per mostrare la ricetta
        } else {
            // Se non viene trovata una ricetta con l'ID specificato, restituisci una vista
            // di errore
            model.addAttribute("errore", "Ricetta non trovata per l'ID specificato");
            return "Errore"; // Ritorna la vista per mostrare l'errore
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
