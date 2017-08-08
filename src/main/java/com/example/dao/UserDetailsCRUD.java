package com.example.dao;

import com.example.model.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@DAOQualifier(type = DAOQualifier.QualifierType.USER_DETAILS)
public class UserDetailsCRUD extends GenericDAO<UserDetails> {

    public Optional<UserDetails> readByLogin(String login) {
        return null;
    }
}