package com.example.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class UserTo {

    private Long id;
    @NotNull
    @Size(min = 3, max = 15)
    private String login;
    @NotNull
    @Size(min = 5, max = 15)
    private String password;
    @NotBlank
    @Email
    private String email;
    @NotNull
    private UserDetailsTo userDetails;
    private List<VoteTo> votes;
    private List<NewsTo> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDetailsTo getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetailsTo userDetails) {
        this.userDetails = userDetails;
    }

    public List<VoteTo> getVotes() {
        return votes;
    }

    public void setVotes(List<VoteTo> votes) {
        this.votes = votes;
    }

    public List<NewsTo> getNews() {
        return news;
    }

    public void setNews(List<NewsTo> news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTo userTo = (UserTo) o;

        if (id != null ? !id.equals(userTo.id) : userTo.id != null) return false;
        if (login != null ? !login.equals(userTo.login) : userTo.login != null) return false;
        if (password != null ? !password.equals(userTo.password) : userTo.password != null) return false;
        if (email != null ? !email.equals(userTo.email) : userTo.email != null) return false;
        if (userDetails != null ? !userDetails.equals(userTo.userDetails) : userTo.userDetails != null) return false;
        if (votes != null ? !votes.equals(userTo.votes) : userTo.votes != null) return false;
        return news != null ? news.equals(userTo.news) : userTo.news == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (userDetails != null ? userDetails.hashCode() : 0);
        result = 31 * result + (votes != null ? votes.hashCode() : 0);
        result = 31 * result + (news != null ? news.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return String.format("UserTo{id=%d, login=%s, password=%s, email=%s, userDetails=%s, votes=%s, news=%s", id, login, password, email, userDetails, votes, news);
    }
}