package com.example.dao;

import com.example.model.Vote;
import com.example.service.VoteService;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class VoteCRUD implements VoteDAO {

    private VoteService voteService;

    public VoteCRUD(VoteService voteService) {
        this.voteService = voteService;
    }

    @Override
    public Optional<Vote> create(Vote object) {
        return null;
    }

    @Override
    public Optional<Vote> readById(Long id) {
        return null;
    }

    @Override
    public Optional<Vote> update(Vote object) {
        return null;
    }

    @Override
    public boolean delete(Vote object) {
        return false;
    }
}