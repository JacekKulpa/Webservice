package com.example.dao;

import com.example.model.News;
import com.example.service.NewsService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
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

        final String readByTitle = "SELECT c FROM News c WHERE c.title = :title";

        TypedQuery<News> query = entityManager.createQuery(readByTitle, News.class);

        query.setParameter("title", title);

        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public Optional<List<News>> readAll() {

        final String readAll = "SELECT c FROM News c";

        TypedQuery<News> query = entityManager.createQuery(readAll, News.class);

        return Optional.of(query.getResultList());
    }

    @Override
    public Optional<News> update(News object) throws PersistenceException {

        News news = entityManager.merge(object);

        return Optional.of(news);
    }

    @Override
    public boolean delete(News object) {

        entityManager.remove(object);

        return true;
    }
}