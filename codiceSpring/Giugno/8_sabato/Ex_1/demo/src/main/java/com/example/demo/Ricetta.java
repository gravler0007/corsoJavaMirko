package com.example.demo;

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
    private String ingredienti;
    private String procedimento;

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getIngredienti() {
        return ingredienti;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }
    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    
}
