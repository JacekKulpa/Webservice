package com.example.dao;

import com.example.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO extends GenericDAO<User> {

    @Override
    Optional<User> create(User object);

    @Override
    Optional<User> readById(Long id);

    Optional<User> readByLogin(String login);

    Optional<List<User>> readAll();

    @Override
    Optional<User> update(User object);

    @Override
    boolean delete(User object);
}