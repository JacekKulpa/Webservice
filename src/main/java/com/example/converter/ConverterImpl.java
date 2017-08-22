package com.example.converter;

import com.example.dto.NewsTo;
import com.example.dto.UserTo;
import com.example.dto.VoteTo;
import com.example.model.News;
import com.example.model.User;
import com.example.model.Vote;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterImpl implements Converter {

    private ModelMapper modelMapper;

    public ConverterImpl() {
        modelMapper = new ModelMapper();
    }

    @Override
    public User convertToDb(UserTo userTo) {

        return modelMapper.map(userTo, User.class);
    }

    @Override
    public News convertToDb(NewsTo newsTo) {

        return modelMapper.map(newsTo, News.class);
    }

    @Override
    public Vote convertToDb(VoteTo voteTo) {

        return modelMapper.map(voteTo, Vote.class);
    }

    @Override
    public UserTo convertFromDb(User user) {

        return modelMapper.map(user, UserTo.class);
    }

    @Override
    public NewsTo convertFromDb(News news) {

        return modelMapper.map(news, NewsTo.class);
    }

    @Override
    public VoteTo convertFromDb(Vote vote) {

        return modelMapper.map(vote, VoteTo.class);
    }

    @Override
    public List<UserTo> convertUsersFromDb(List<User> users) {

        return users.stream().map(this::convertFromDb).collect(Collectors.toList());
    }

    @Override
    public List<NewsTo> convertNewsFromDb(List<News> news) {

        return news.stream().map(this::convertFromDb).collect(Collectors.toList());
    }

    @Override
    public List<VoteTo> convertVotesFromDb(List<Vote> votes) {

        return votes.stream().map(this::convertFromDb).collect(Collectors.toList());
    }
}