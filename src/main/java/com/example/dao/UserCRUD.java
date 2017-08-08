package com.example.dao;

import com.example.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@DAOQualifier(type = DAOQualifier.QualifierType.USER)
public class UserCRUD extends GenericDAO<User> {

    public Optional<User> readByLogin(String login) {
        return null;
    }

    public Optional<List<User>> readAll() {
        return null;
    }
}