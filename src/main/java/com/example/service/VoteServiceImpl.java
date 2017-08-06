package com.example.service;

import com.example.dao.VoteCRUD;
import com.example.dao.VoteDAO;
import com.example.dto.VoteTo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VoteServiceImpl implements VoteService {

    private VoteDAO voteDAO;

    public VoteServiceImpl() {
        voteDAO = new VoteCRUD(this);
    }

    @Override
    public ResponseEntity<Void> createVote(VoteTo vote) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateVote(VoteTo vote) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteVote(VoteTo vote) {
        return null;
    }
}