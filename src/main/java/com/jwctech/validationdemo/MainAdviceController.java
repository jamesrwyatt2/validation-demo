package com.jwctech.validationdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;



@RestControllerAdvice
public class MainAdviceController {

    private static final Logger LOG = LoggerFactory.getLogger(MainAdviceController.class);

//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(value = MethodArgumentNotValidException.class)
//    public ErrorMessage handleTokenRefreshException(MethodArgumentNotValidException ex, WebRequest request) {
//
//        Map<String, String> errors = new HashMap<>();
//
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//
//        LOG.error("Bad Request: {}", errors.toString());
//
//        return new ErrorMessage(
//                HttpStatus.BAD_REQUEST.value(),
//                new Date(),
//                errors.toString().replace("{", "").replace("}", ", "),
//                request.getDescription(false));
//    }

}
