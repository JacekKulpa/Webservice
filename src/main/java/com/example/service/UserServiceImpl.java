package com.example.service;

import com.example.dao.UserDAO;
import com.example.dto.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public ResponseEntity<Void> createUser(UserTo user) {
        return null;
    }

    @Override
    public ResponseEntity<UserTo> getUserById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UserTo> getUserByLogin(String login) {
        return null;
    }

    @Override
    public ResponseEntity<List<UserTo>> getUserList() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(UserTo user) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(UserTo user) {
        return null;
    }
}