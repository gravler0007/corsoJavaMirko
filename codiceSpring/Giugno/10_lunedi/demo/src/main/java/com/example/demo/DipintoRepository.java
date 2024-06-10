package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DipintoRepository extends JpaRepository<Dipinto, Long> {
    //qui mi sono fatto aiutare da chatGPT
    List<Dipinto> findByAutoreAndAnno(String autore, int anno);

    List<Dipinto> findByAutore(String autore);

    List<Dipinto> findByAnno(int anno);
}
