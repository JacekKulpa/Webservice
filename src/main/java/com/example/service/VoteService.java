package com.example.service;

import com.example.dto.VoteTo;
import org.springframework.http.ResponseEntity;

public interface VoteService extends GenericService<VoteTo> {

    @Override
    ResponseEntity<VoteTo> create(VoteTo object);

    @Override
    ResponseEntity<VoteTo> update(VoteTo object);

    @Override
    ResponseEntity<Void> delete(VoteTo object);
}