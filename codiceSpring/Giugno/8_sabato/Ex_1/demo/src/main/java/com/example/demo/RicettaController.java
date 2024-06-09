package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
