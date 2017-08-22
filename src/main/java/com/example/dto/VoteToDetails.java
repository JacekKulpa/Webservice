package com.example.dto;

import com.example.model.User;
import com.example.model.Vote;

import javax.validation.constraints.NotNull;

public class VoteToDetails {

    private Long id;
    @NotNull
    private Vote vote;
    @NotNull
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoteToDetails that = (VoteToDetails) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (vote != null ? !vote.equals(that.vote) : that.vote != null) return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (vote != null ? vote.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return String.format("voteDetails{id=%d, vote=%s, user=%s}", id, vote, user);
    }
}