package com.example.dao;

import com.example.model.News;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NewsCRUD implements NewsDAO {

    @Override
    public Optional<News> create(News object) {
        return null;
    }

    @Override
    public Optional<News> readById(Long id) {
        return null;
    }

    @Override
    public Optional<News> readByTitle(String title) {
        return null;
    }

    @Override
    public Optional<List<News>> readAll() {
        return null;
    }

    @Override
    public Optional<News> update(News object) {
        return null;
    }

    @Override
    public boolean delete(News object) {
        return false;
    }
}