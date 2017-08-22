package com.example.validator;

import org.springframework.http.HttpStatus;

public interface Validator {

    HttpStatus validate(Object object);

    boolean check(Object object);
}