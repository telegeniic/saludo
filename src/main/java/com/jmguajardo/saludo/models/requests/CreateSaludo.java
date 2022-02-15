package com.jmguajardo.saludo.models.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateSaludo {

    private String tipo;

    private String saludo;
}