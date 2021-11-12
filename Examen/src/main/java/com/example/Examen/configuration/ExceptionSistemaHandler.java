package com.example.Examen.configuration;

import com.example.Examen.controller.InexistenteException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionSistemaHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ InexistenteException.class })
    protected ResponseEntity<Object> handleNotFound(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "Result not found",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
