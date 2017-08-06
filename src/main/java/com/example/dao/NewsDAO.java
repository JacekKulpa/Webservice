package com.example.dao;

import com.example.model.News;

import java.util.List;
import java.util.Optional;

public interface NewsDAO extends GenericDAO<News> {

    @Override
    Optional<News> create(News object);

    @Override
    Optional<News> readById(Long id);

    Optional<News> readByTitle(String title);

    Optional<List<News>> readAll();

    @Override
    Optional<News> update(News object);

    @Override
    boolean delete(News object);
}
