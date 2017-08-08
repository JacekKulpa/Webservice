package com.example.dao;

import com.example.model.News;
import com.example.service.NewsService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class NewsCRUD implements NewsDAO {

    @PersistenceContext
    private EntityManager entityManager;

    private NewsService newsService;


    public NewsCRUD(NewsService newsService) {
        this.newsService = newsService;
    }


    @Override
    public Optional<News> create(News object) throws PersistenceException {

        entityManager.persist(object);

        return Optional.of(object);
    }

    @Override
    public Optional<News> readById(Long id) {

        News news = entityManager.find(News.class, id);

        return Optional.ofNullable(news);
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
    public Optional<News> update(News object) throws PersistenceException{

        News news = entityManager.merge(object);

        return Optional.of(news);
    }

    @Override
    public boolean delete(News object) {

        entityManager.remove(object);

        return true;
    }
}