package com.digital.crud.saladereuniao.saladereuniao.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ErrorDetails {

    // Atributos
    private Date timestamp;
    private String message;
    private String details;

    // Construtor
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
