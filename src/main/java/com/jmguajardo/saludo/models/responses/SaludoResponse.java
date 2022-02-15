package com.jmguajardo.saludo.models.responses;

import com.jmguajardo.saludo.models.entities.Saludo;
import com.jmguajardo.saludo.models.entities.Tipo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaludoResponse {

    private Long id;

    private Tipo tipo;

    private String saludo;

    public SaludoResponse(Saludo saludo){
        this.id = saludo.getId();
        this.tipo = saludo.getTipo();
        this.saludo = saludo.getSaludo();
    }
    
}
