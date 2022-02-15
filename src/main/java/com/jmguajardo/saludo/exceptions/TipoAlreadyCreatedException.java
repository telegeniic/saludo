package com.jmguajardo.saludo.exceptions;

import lombok.Getter;

@Getter
public class TipoAlreadyCreatedException extends RuntimeException{

    private Integer cod = 900;

    public TipoAlreadyCreatedException(){
        super("Tipo de saludo existente");
    }
    
}
