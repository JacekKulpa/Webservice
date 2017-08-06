package com.example.dao;

import com.example.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;
import java.util.Optional;

@Repository
public class UserCRUD implements UserDAO {

    @PersistenceUnit
    EntityManagerFactory emf;

    @Override
    public Optional<User> create(User object) {
        return null;
    }

    @Override
    public Optional<User> readById(Long id) {
        return null;
    }

    @Override
    public Optional<User> readByLogin(String login) {
        return null;
    }

    @Override
    public Optional<List<User>> readAll() {
        return null;
    }

    @Override
    public Optional<User> update(User object) {
        return null;
    }

    @Override
    public boolean delete(User object) {
        return false;
    }
}