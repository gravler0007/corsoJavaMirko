package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruttoService {
     @Autowired
    private FruttoRepository fruttoRepository;

    public List<Frutto> findAll() {
        return fruttoRepository.findAll();
    }

    public Optional<Frutto> findById(Long id) {
        return fruttoRepository.findById(id);
    }

    public Frutto save(Frutto frutto) {
        return fruttoRepository.save(frutto);
    }

    public void deleteById(Long id) {
        fruttoRepository.deleteById(id);
    }
}
