package com.example.service;

import com.example.dto.VoteTo;
import org.springframework.http.ResponseEntity;

public interface VoteService {

    ResponseEntity<Void> createVote(VoteTo vote);

    ResponseEntity<Void> updateVote(VoteTo vote);

    ResponseEntity<Void> deleteVote(VoteTo vote);
}