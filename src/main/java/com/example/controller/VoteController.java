package com.example.controller;

import com.example.dto.VoteTo;
import com.example.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/votes", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class VoteController {

    private VoteService voteService;

    @Autowired
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping
    ResponseEntity<Void> createVote(@RequestBody VoteTo vote) {

        return voteService.create(vote);
    }

    @PutMapping
    ResponseEntity<Void> updateVote(@RequestBody VoteTo vote) {

        return voteService.update(vote);
    }

    @DeleteMapping
    ResponseEntity<Void> deleteVote(@RequestBody VoteTo vote) {

        return voteService.delete(vote);
    }
}