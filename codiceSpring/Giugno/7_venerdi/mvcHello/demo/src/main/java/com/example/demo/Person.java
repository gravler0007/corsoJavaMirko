package com.example.demo;

import jakarta.persistence.Entity;

@Entity
public class Person {
    private String name;
    private int age;

    // Getter e Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}