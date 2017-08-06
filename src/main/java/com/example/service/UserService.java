package com.example.service;

import com.example.dto.UserTo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    ResponseEntity<Void> createUser(UserTo user);

    ResponseEntity<UserTo> getUserById(Long id);

    ResponseEntity<UserTo> getUserByLogin(String login);

    ResponseEntity<List<UserTo>> getUserList();

    ResponseEntity<Void> updateUser(UserTo user);

    ResponseEntity<Void> deleteUser(UserTo user);
}