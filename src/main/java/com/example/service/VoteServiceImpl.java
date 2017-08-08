package com.example.service;

import com.example.dao.VoteDAO;
import com.example.dto.VoteTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VoteServiceImpl implements VoteService {

    private VoteDAO voteDAO;

    @Autowired
    public VoteServiceImpl(VoteDAO voteDAO) {
        this.voteDAO = voteDAO;
    }

    @Override
    public ResponseEntity<Void> create(VoteTo vote) {
        return null;
    }

    @Override
    public ResponseEntity<Void> update(VoteTo vote) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(VoteTo vote) {
        return null;
    }
}