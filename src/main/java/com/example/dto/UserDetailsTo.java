package com.example.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserDetailsTo {

    private Long id;
    @NotNull
    private String pesel;
    @NotNull
    private String iban;
    private Boolean online;
}
