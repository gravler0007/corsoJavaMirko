package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/frutti")

public class FruttoController {
    @Autowired
    private FruttoService fruttoService;

    @GetMapping
    public List<Frutto> getAllFrutti() {
        return fruttoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Frutto> getFruttoById(@PathVariable Long id) {
        Optional<Frutto> frutto = fruttoService.findById(id);
        if (frutto.isPresent()) {
            return ResponseEntity.ok(frutto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Frutto createFrutto(@RequestBody Frutto frutto) {
        return fruttoService.save(frutto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Frutto> updateFrutto(@PathVariable Long id, @RequestBody Frutto fruttoDetails) {
        Optional<Frutto> fruttoOptional = fruttoService.findById(id);
        if (fruttoOptional.isPresent()) {
            Frutto frutto = fruttoOptional.get();
            frutto.setNome(fruttoDetails.getNome());
            frutto.setPrezzo(fruttoDetails.getPrezzo());
            frutto.setPrezzo(fruttoDetails.getPrezzo());
            return ResponseEntity.ok(fruttoService.save(frutto));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFrutto(@PathVariable Long id) {
        Optional<Frutto> frutto = fruttoService.findById(id);
        if (frutto.isPresent()) {
            fruttoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
