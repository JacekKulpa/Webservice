package com.example.service;

import com.example.dto.UserTo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService extends GenericService<UserTo> {

    @Override
    ResponseEntity<UserTo> create(UserTo object);

    ResponseEntity<UserTo> getUserById(Long id);

    ResponseEntity<UserTo> getUserByLogin(String login);

    ResponseEntity<List<UserTo>> getUserList();

    @Override
    ResponseEntity<UserTo> update(UserTo object);

    @Override
    ResponseEntity<Void> delete(UserTo object);
}