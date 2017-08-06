package com.example.dao;

import com.example.model.Vote;

import java.util.Optional;

public interface VoteDAO extends GenericDAO<Vote> {

    @Override
    Optional<Vote> create(Vote object);

    @Override
    Optional<Vote> readById(Long id);

    @Override
    Optional<Vote> update(Vote object);

    @Override
    boolean delete(Vote object);
}