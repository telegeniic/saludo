package com.jmguajardo.saludo.exceptions;

import lombok.Getter;

@Getter
public class TipoNotDefined extends RuntimeException{

    private Integer cod = 404;
    
    public TipoNotDefined(){
        super("El tipo no ah sido definido");
    }
}
