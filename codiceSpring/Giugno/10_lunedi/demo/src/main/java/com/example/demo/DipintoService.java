package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DipintoService {

    //emitter per aggiornare la pagina (non so bene cosa faccia)
    private final List<SseEmitter> emitters = new ArrayList<>();

    @Autowired
    private DipintoRepository dipintoRepository;

    public List<Dipinto> getAllPaintings() {
        return dipintoRepository.findAll();
    }

    public Dipinto addPainting(Dipinto dipinto) {
        return dipintoRepository.save(dipinto);
    }

    //quetsa parte non sarei riuscito a farla da solo, mi sono fatto aiutare da chatGPT

    public List<Dipinto> searchPaintingsByAuthorAndYear(String autore, Integer anno) {
        if (autore != null && anno != null) {
            return dipintoRepository.findByAutoreAndAnno(autore, anno);
        } else if (autore != null) {
            return dipintoRepository.findByAutore(autore);
        } else if (anno != null) {
            return dipintoRepository.findByAnno(anno);
        } else {
            return dipintoRepository.findAll();
        }
    }

    public Dipinto save(Dipinto dipinto) {
        return dipintoRepository.save(dipinto);
    }

}
