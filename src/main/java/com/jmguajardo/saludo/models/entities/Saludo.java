package com.jmguajardo.saludo.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jmguajardo.saludo.models.requests.CreateSaludo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="saludos")
public class Saludo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="tipo", unique=true)
    private Tipo tipo;

    @Column(name="saludo")
    private String saludo;

    public Saludo(CreateSaludo createSaludo){
        this.tipo = Tipo.valueOf(createSaludo.getTipo().toUpperCase());
        this.saludo = createSaludo.getSaludo();
    }
    
}
