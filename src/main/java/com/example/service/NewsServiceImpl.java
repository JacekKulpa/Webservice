package com.example.service;

import com.example.dao.NewsCRUD;
import com.example.dao.NewsDAO;
import com.example.dto.NewsTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private NewsDAO newsDAO;

    @Autowired
    Validator validator;

    public NewsServiceImpl() {
        this.newsDAO = new NewsCRUD(this);
    }

    @Override
    public ResponseEntity<NewsTo> create(NewsTo news) {
        return null;
    }

    @Override
    public ResponseEntity<NewsTo> getNewsById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<NewsTo> getNewsByTitle(String name) {
        return null;
    }

    @Override
    public ResponseEntity<List<NewsTo>> getNewsList() {
        return null;
    }

    @Override
    public ResponseEntity<NewsTo> update(NewsTo news) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(NewsTo news) {
        return null;
    }
}