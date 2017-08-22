package com.example.dao;

import com.example.model.User;
import org.springframework.stereotype.Repository;

@Repository
@DAOQualifier(type = DAOQualifier.QualifierType.USER)
public class UserCRUD extends GenericDAO<User> {

}