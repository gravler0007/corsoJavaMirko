package com.example.demo;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Ricetta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private ArrayList<String> ingredienti;
    private String procedimento;

    public Long getId() {
        return id;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }
    public String getNome() {
        return nome;
    }

    public String getProcedimento() {
        return procedimento;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setIngredienti(ArrayList<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }
}
