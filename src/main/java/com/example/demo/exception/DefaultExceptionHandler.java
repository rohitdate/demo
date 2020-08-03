package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Object> handleExceptionNotFound(NotFoundException e) {
        ApiException apiException = new ApiException(e.getMessage(), NOT_FOUND);

        return new ResponseEntity<>(apiException, NOT_FOUND);
    }

    @ExceptionHandler(value = InternalServerException.class)
    public ResponseEntity<Object> handleExceptionInternalServerError(InternalServerException e) {
        ApiException apiException = new ApiException(e.getMessage(), INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(apiException, INTERNAL_SERVER_ERROR);
    }
}
