package com.example.controller;

import com.example.dto.UserTo;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody UserTo user) {

        return userService.create(user);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserTo> getUserById(@PathVariable Long id) {

        return userService.getUserById(id);
    }

    @GetMapping(params = {"login"})
    public ResponseEntity<UserTo> getUserByLogin(@RequestParam String login) {

        return userService.getUserByLogin(login);
    }

    @GetMapping
    public ResponseEntity<List<UserTo>> getUserList() {

        return userService.getUserList();
    }

    @PutMapping
    public ResponseEntity<Void> updateUser(@RequestBody UserTo user) {

        return userService.update(user);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@RequestBody UserTo user) {

        return userService.delete(user);
    }

}