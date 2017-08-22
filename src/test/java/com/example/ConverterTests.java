package com.example;

import com.example.converter.Converter;
import com.example.converter.ConverterImpl;
import com.example.dto.NewsTo;
import com.example.dto.UserTo;
import com.example.dto.VoteTo;
import com.example.model.News;
import com.example.model.User;
import com.example.model.Vote;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ConverterTests extends ApplicationTests {

    public Converter converter;

    @Mock
    private ModelMapper modelMapper;

    @Before
    public void setUp() {
        converter = new ConverterImpl();
    }

    @Test
    public void convertUserToDb() {

        UserTo userTo = new UserTo();
        User user = new User();

        Mockito.when(modelMapper.map(userTo, User.class)).thenReturn(user);
        Assert.assertEquals(user, converter.convertToDb(userTo));
    }

    @Test
    public void convertNewsToDb() {

        NewsTo newsTo = new NewsTo();
        News news = new News();

        Mockito.when(modelMapper.map(newsTo, News.class)).thenReturn(news);
        Assert.assertEquals(news, converter.convertToDb(newsTo));
    }

    @Test
    public void convertVoteToDb() {

        VoteTo voteTo = new VoteTo();
        Vote vote = new Vote();

        Mockito.when(modelMapper.map(voteTo, Vote.class)).thenReturn(vote);
        Assert.assertEquals(vote, converter.convertToDb(voteTo));
    }

    @Test
    public void convertUserFromDb() {

        UserTo userTo = new UserTo();
        User user = new User();

        Mockito.when(modelMapper.map(user, UserTo.class)).thenReturn(userTo);
        Assert.assertEquals(userTo, converter.convertFromDb(user));
    }

    @Test
    public void convertNewsFromDb() {

        NewsTo newsTo = new NewsTo();
        News news = new News();

        Mockito.when(modelMapper.map(news, NewsTo.class)).thenReturn(newsTo);
        Assert.assertEquals(newsTo, converter.convertFromDb(news));
    }

    @Test
    public void convertVoteFromDb() {

        VoteTo voteTo = new VoteTo();
        Vote vote = new Vote();

        Mockito.when(modelMapper.map(vote, VoteTo.class)).thenReturn(voteTo);
        Assert.assertEquals(voteTo, converter.convertFromDb(vote));
    }


    @Test
    public void convertUsersFromDb() {

        List<User> users = new ArrayList<>();
        List<UserTo> usersTo = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            users.add(new User());
            usersTo.add(new UserTo());
        }

        Mockito.when(modelMapper.map(users.get(0), UserTo.class)).thenReturn(usersTo.get(0));
        Mockito.when(modelMapper.map(users.get(1), UserTo.class)).thenReturn(usersTo.get(1));
        Mockito.when(modelMapper.map(users.get(2), UserTo.class)).thenReturn(usersTo.get(2));

        Assert.assertEquals(usersTo, converter.convertUsersFromDb(users));
    }

    @Test
    public void convertNewsListFromDb() {

        List<NewsTo> newsTo = new ArrayList<>();
        List<News> news = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            newsTo.add(new NewsTo());
            news.add(new News());
        }

        Mockito.when(modelMapper.map(news.get(0), NewsTo.class)).thenReturn(newsTo.get(0));
        Mockito.when(modelMapper.map(news.get(1), NewsTo.class)).thenReturn(newsTo.get(1));
        Mockito.when(modelMapper.map(news.get(2), NewsTo.class)).thenReturn(newsTo.get(2));

        Assert.assertEquals(newsTo, converter.convertNewsFromDb(news));
    }

    @Test
    public void convertVotesFromDb() {

        List<VoteTo> votesTo = new ArrayList<>();
        List<Vote> votes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            votesTo.add(new VoteTo());
            votes.add(new Vote());
        }

        Mockito.when(modelMapper.map(votes.get(0), VoteTo.class)).thenReturn(votesTo.get(0));
        Mockito.when(modelMapper.map(votes.get(1), VoteTo.class)).thenReturn(votesTo.get(1));
        Mockito.when(modelMapper.map(votes.get(2), VoteTo.class)).thenReturn(votesTo.get(2));

        Assert.assertEquals(votesTo, converter.convertVotesFromDb(votes));
    }
}