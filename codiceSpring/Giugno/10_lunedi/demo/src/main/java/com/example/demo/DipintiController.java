package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public Dipinto addPainting(@RequestBody Dipinto dipinto) {
        return dipintoService.addPainting(dipinto);
    }

    @GetMapping("/cerca")
    public List<Dipinto> searchPaintingsByAuthorAndYear(
            @RequestParam(required = false) String autore,
            @RequestParam(required = false) Integer anno) {
        return dipintoService.searchPaintingsByAuthorAndYear(autore, anno);
    }
}
