package com.example;

import com.example.validator.ValidatorImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;

import static org.mockito.Matchers.any;

public class ValidatorTests extends ApplicationTests {

    private ValidatorImpl validatorImpl;

    @Mock
    org.springframework.validation.Validator validator;

    @Before
    public void setUp() {
        validatorImpl = Mockito.spy(new ValidatorImpl(validator));
    }

    @Test
    public void validate() {

        Mockito.doReturn(true).when(validatorImpl).check(Mockito.any());
        Assert.assertEquals(HttpStatus.CREATED, validatorImpl.validate(any()));

        Mockito.doReturn(false).when(validatorImpl).check(Mockito.any());
        Assert.assertEquals(HttpStatus.BAD_REQUEST, validatorImpl.validate(Mockito.any()));

    }
}