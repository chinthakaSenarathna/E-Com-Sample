package com.example.E_com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( value = HttpStatus.BAD_REQUEST )
public class ProductNotAvailableException extends RuntimeException{
    public ProductNotAvailableException(String message){
        super(message);
    }
}
