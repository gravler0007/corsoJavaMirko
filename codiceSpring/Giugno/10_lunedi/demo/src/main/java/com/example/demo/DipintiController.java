package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return "dipinti";
    }

    @PostMapping("/aggiungi")
    public ResponseEntity<Dipinto> addPainting(@RequestBody Dipinto dipinto) {
        Dipinto newDipinto = dipintoService.addPainting(dipinto);
        // Invia l'evento SSE (non so bene cosa faccia)
        dipintoService.sendSseUpdate();
        return ResponseEntity.status(HttpStatus.OK).body(newDipinto);
    }

    @GetMapping("/cerca")
    public ResponseEntity<List<Dipinto>> searchPaintingsByAuthorAndYear(
            @RequestParam(required = false) String autore,
            @RequestParam(required = false) Integer anno) {
        List<Dipinto> dipinti = dipintoService.searchPaintingsByAuthorAndYear(autore, anno);
        return ResponseEntity.ok(dipinti);
    }
}
