package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Denota questa classe come un controller all'interno del modello MVC,
            // permettendo di gestire le richieste HTTP.
public class HelloWorldController {

    @RequestMapping("/hello") // Associa questo metodo alle richieste HTTP GET inviate a "/hello", facendolo
                              // agire come gestore per tale endpoint.
    @ResponseBody // Indica che la stringa restituita dal metodo deve essere inviata come corpo
                  // della risposta HTTP, anziché interpretarla come un nome di vista.
    public String sayHello() {
        return "Hello World"; // Questa è la logica del metodo; restituisce la stringa "Hello World", che sarà
                              // il corpo della risposta HTTP.
    }
}
