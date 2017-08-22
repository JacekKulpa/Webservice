package com.example.dao;

import com.example.model.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
@DAOQualifier(type = DAOQualifier.QualifierType.USER_DETAILS)
public class UserDetailsCRUD extends GenericDAO<UserDetails> {


}