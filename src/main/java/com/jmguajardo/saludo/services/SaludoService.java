package com.jmguajardo.saludo.services;

import java.util.List;

import com.jmguajardo.saludo.models.entities.Saludo;
import com.jmguajardo.saludo.models.entities.Tipo;
import com.jmguajardo.saludo.models.requests.CreateSaludo;
import com.jmguajardo.saludo.repositories.SaludoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    @Autowired
    SaludoRepository saludoRepository;

    public List<Saludo> getAllSaludo(){
        return saludoRepository.findAll();
    }

    public Saludo createSaludo(CreateSaludo cSaludo){
        Saludo saludo = new Saludo(cSaludo);
        return saludoRepository.save(saludo);
    }

    public Saludo findByTipo(String tipo){
        return saludoRepository.findByTipo(Tipo.valueOf(tipo.toUpperCase()));
    }
}
