package com.example.service;

import com.example.dto.VoteTo;
import org.springframework.http.ResponseEntity;

public interface VoteService extends GenericService<VoteTo> {

    @Override
    ResponseEntity<Void> create(VoteTo object);

    @Override
    ResponseEntity<Void> update(VoteTo object);

    @Override
    ResponseEntity<Void> delete(VoteTo object);
}