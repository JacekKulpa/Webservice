package com.example.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

@Component
public class ValidatorImpl implements Validator {

    private org.springframework.validation.Validator validator;

    @Autowired
    public ValidatorImpl(org.springframework.validation.Validator validator) {
        this.validator = validator;
    }


    @Override
    public HttpStatus validate(Object object) {

        if (check(object)) {
            return HttpStatus.CREATED;
        }
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public boolean check(Object object) {

        Errors errors = new BeanPropertyBindingResult(object, "object");

        validator.validate(object, errors);

        return !errors.hasErrors();
    }
}