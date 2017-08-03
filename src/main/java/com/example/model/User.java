package com.example.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;
    @NotNull
    @Size(min = 3, max = 15)
    @Column(unique = true)
    private String login;
    @NotNull
    @Size(min = 5, max = 15)
    private String password;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotNull
    @OneToOne
    private UserDetails userDetails;
    @OneToMany
    @JoinColumn(name = "user_id", referencedColumnName = "id_user")
    private List<Vote> votes;
    @OneToMany
    @JoinColumn(name = "user_id", referencedColumnName = "id_user")
    private List<News> news;

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

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (userDetails != null ? !userDetails.equals(user.userDetails) : user.userDetails != null) return false;
        if (votes != null ? !votes.equals(user.votes) : user.votes != null) return false;
        return news != null ? news.equals(user.news) : user.news == null;
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

        return String.format("User{id=%d, login=%s, password=%s, email=%s, userDetails=%s, votes=%s, news=%s}", id, login, password, email, userDetails, votes, news);
    }
}
