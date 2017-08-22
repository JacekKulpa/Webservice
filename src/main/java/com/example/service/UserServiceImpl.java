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

    private GenericDAO genericDAO;
//    private GenericDAO uDetailsGenericDAO;

    @Autowired
    public UserServiceImpl(@DAOQualifier(type = DAOQualifier.QualifierType.USER) GenericDAO genericDAO) {
//                           @DAOQualifierOQualifier(type = DAOQualifier.QualifierType.USER_DETAILS) GenericDAO uDetailsGenericDAO) {
        this.genericDAO = genericDAO;
//        this.uDetailsGenericDAO = uDetailsGenericDAO;
    }

    @Override
    public ResponseEntity<UserTo> create(UserTo user) {
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
    public ResponseEntity<UserTo> update(UserTo user) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(UserTo user) {
        return null;
    }
}