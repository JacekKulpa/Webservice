package com.example.service;

import com.example.dao.DAOQualifier;
import com.example.dao.GenericDAO;
import com.example.dto.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private GenericDAO userGenericDAO;
    private GenericDAO uDetailsGenericDAO;

    @Autowired
    public UserServiceImpl(@DAOQualifier(type = DAOQualifier.QualifierType.USER) GenericDAO userGenericDAO,
                           @DAOQualifier(type = DAOQualifier.QualifierType.USER_DETAILS) GenericDAO uDetailsGenericDAO) {
        this.userGenericDAO = userGenericDAO;
        this.uDetailsGenericDAO = uDetailsGenericDAO;
    }

    @Override
    public ResponseEntity<Void> create(UserTo user) {
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
    public ResponseEntity<Void> update(UserTo user) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(UserTo user) {
        return null;
    }
}