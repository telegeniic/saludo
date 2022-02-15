package com.jmguajardo.saludo.controllers;

import com.jmguajardo.saludo.models.entities.Saludo;
import com.jmguajardo.saludo.models.requests.CreateSaludo;
import com.jmguajardo.saludo.models.responses.SaludoResponse;
import com.jmguajardo.saludo.services.SaludoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/saludo/")
public class SaludoController {
    
    @Autowired
    SaludoService saludoService;

    @PostMapping("agregar_saludo")
    public SaludoResponse createSaludo(@RequestBody CreateSaludo cSaludo){
        Saludo saludo = saludoService.createSaludo(cSaludo);
        return new SaludoResponse(saludo);
    }

}
