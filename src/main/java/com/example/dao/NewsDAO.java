package com.example.dao;

import com.example.model.News;

import javax.persistence.PersistenceException;
import java.util.List;
import java.util.Optional;

public interface NewsDAO {

    Optional<News> create(News object) throws PersistenceException;

    Optional<News> readById(Long id);

    Optional<News> readByTitle(String title);

    Optional<List<News>> readAll();

    Optional<News> update(News object) throws PersistenceException;

    boolean delete(News object);
}
