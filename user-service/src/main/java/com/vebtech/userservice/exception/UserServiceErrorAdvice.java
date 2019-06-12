package com.vebtech.userservice.exception;


import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserServiceErrorAdvice {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({UserNotFoundException.class})
    public void handle(UserNotFoundException e) {}
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({InternalServerException.class, SQLException.class, NullPointerException.class})
    public void handle() {}
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({UserServiceValidationException.class})
    public void handle(UserServiceValidationException e) {}
}
