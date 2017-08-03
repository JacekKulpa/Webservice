package com.example.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class VoteTo {

    private Long id;
    @NotNull
    private VoteType voteType;

    public enum VoteType {

        UP_VOTE, DOWN_VOTE;
    }
}