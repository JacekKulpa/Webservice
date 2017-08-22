package com.example.dao;

import com.example.model.Vote;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VoteDAO extends CrudRepository<Vote, Long> {

    List<Vote> findAllByVoteType(Vote.VoteType voteType);
}