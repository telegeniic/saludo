package com.jmguajardo.saludo.exceptions;

import com.jmguajardo.saludo.payload.ErrorDetails;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(TipoAlreadyCreatedException.class)
    public ResponseEntity<ErrorDetails> handleTipoAlreadyCreated(TipoAlreadyCreatedException exception){
        ErrorDetails errorDetails = new ErrorDetails(exception.getCod(), exception.getMessage());
        logger.warn("Excepcion: TipoAlreadyCreatedException");
        logger.warn("Causa: Se intento crear un nuevo tipo de salido, cuando ya existe un registro con dicho tipo, los tipos son unicos");
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(TipoNotDefinedException.class)
    public ResponseEntity<ErrorDetails> handleTipoNotDefined(TipoNotDefinedException exception){
        ErrorDetails errorDetails = new ErrorDetails(exception.getCod(), exception.getMessage());
        logger.warn("Excepcion: TipoNotDefinedException");
        logger.warn("Causa: Se intento buscar de un tipo del cual no se tiene registro existente, favor de crear primero el registro o corregir su busqueda");
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
