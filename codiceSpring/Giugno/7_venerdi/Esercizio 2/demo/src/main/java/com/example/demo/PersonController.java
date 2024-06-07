package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/showPerson")
    public String showPerson(Model model) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        model.addAttribute("person", person);
        return "person";
    }
}