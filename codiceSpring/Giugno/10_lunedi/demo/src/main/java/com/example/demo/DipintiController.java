package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/dipinti")
public class DipintiController {

    @Autowired
    private DipintoService dipintoService;

    //metodo senza view
    // @GetMapping("/")
    // public List<Dipinto> getAllPaintings() {
    //     return dipintoService.getAllPaintings();
    // }

    //metodo con la view
    @GetMapping("/visualizza")
    public String viewDipinti(Model model) {
        model.addAttribute("dipinti", dipintoService.getAllPaintings());
        return "VisualizzaDipinti";
    }

    @GetMapping("/aggiungi")
    public String viewAddDipinti(Model model) {
        return "AggiungiDipinti";
    }

    // @PostMapping("/aggiungi")
    // public String addPainting(@ModelAttribute Dipinto dipinto, Model model) {
    //     dipintoService.addPainting(dipinto); // Aggiungi il dipinto al servizio
    //     model.addAttribute("dipinti", dipintoService.getAllPaintings()); // Aggiorna la lista dei dipinti nel modello
    //     return "redirect:/api/dipinti/visualizza"; // Reindirizza alla pagina di visualizzazione dei dipinti
    // }

    @PostMapping("/aggiungi")
    public String addPainting(Dipinto dipinto) {
        dipintoService.save(dipinto);
        return "redirect:/api/dipinti/visualizza"; // Reindirizza alla pagina di visualizzazione dei dipinti
    }
    
    @GetMapping("/cerca")
    public ResponseEntity<List<Dipinto>> searchPaintingsByAuthorAndYear(
            @RequestParam(required = false) String autore,
            @RequestParam(required = false) Integer anno) {
        List<Dipinto> dipinti = dipintoService.searchPaintingsByAuthorAndYear(autore, anno);
        return ResponseEntity.ok(dipinti);
    }
}
