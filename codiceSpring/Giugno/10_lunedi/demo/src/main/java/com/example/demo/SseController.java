package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

//Endpoint SSE: Aggiungi un endpoint per consentire al frontend di sottoscriversi agli aggiornamenti SSE.

@RestController
@RequestMapping("/api/sse")
public class SseController {

    @Autowired
    private DipintoService dipintoService;

    @GetMapping("/subscribe")
    public SseEmitter subscribeToUpdates() {
        return dipintoService.subscribeToUpdates();
    }
}
