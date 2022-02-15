package com.jmguajardo.saludo.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDetails {

    private Integer cod;
    private String mensaje;
    
}
