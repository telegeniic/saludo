package com.jmguajardo.saludo.exceptions;

import com.jmguajardo.saludo.payload.ErrorDetails;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TipoAlreadyCreatedException.class)
    public ResponseEntity<ErrorDetails> handleTipoAlreadyCreated(TipoAlreadyCreatedException exception){
        ErrorDetails errorDetails = new ErrorDetails(exception.getCod(), exception.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
    
}
