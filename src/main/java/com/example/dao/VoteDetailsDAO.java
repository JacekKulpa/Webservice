package com.example.dao;

import com.example.model.VoteDetails;
import org.springframework.data.repository.CrudRepository;

public interface VoteDetailsDAO extends CrudRepository<VoteDetails, Long> {
}