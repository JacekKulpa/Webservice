package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users_details")
public class UserDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_details")
    private Long id;
    @NotNull
    @Column(unique = true)
    private String pesel;
    @NotNull
    @Column(unique = true)
    private String iban;
    private Boolean online;

}
