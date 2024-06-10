package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dipinto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titolo;
    private String autore;
    private int anno;

    public Long getId() {
        return id;
    }
    
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String title) {
        this.titolo = title;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String author) {
        this.autore = author;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
}
