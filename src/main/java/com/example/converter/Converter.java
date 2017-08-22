package com.example.converter;

import com.example.dto.NewsTo;
import com.example.dto.UserTo;
import com.example.dto.VoteTo;
import com.example.model.News;
import com.example.model.User;
import com.example.model.Vote;

import java.util.List;

public interface Converter {

    User convertToDb(UserTo user);

    News convertToDb(NewsTo newsTo);

    Vote convertToDb(VoteTo voteTo);

    UserTo convertFromDb(User user);

    NewsTo convertFromDb(News news);

    VoteTo convertFromDb(Vote vote);

    List<UserTo> convertUsersFromDb(List<User> users);

    List<NewsTo> convertNewsFromDb(List<News> news);

    List<VoteTo> convertVotesFromDb(List<Vote> votes);
}