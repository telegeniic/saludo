package com.jmguajardo.saludo.exceptions;

import lombok.Getter;

@Getter
public class TipoNotDefinedException extends RuntimeException{

    private Integer cod = 404;
    
    public TipoNotDefinedException(){
        super("El tipo no ah sido definido");
    }
}
