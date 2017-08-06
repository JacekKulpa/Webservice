package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "votes")
public class Vote implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vote")
    private Long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private VoteType voteType;

    public enum VoteType {

        UP_VOTE, DOWN_VOTE;
    }
}
