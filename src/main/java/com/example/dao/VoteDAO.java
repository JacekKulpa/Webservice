package com.example.dao;

import com.example.model.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteDAO extends CrudRepository<Vote, Long> {
}