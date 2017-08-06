package com.example.service;

import com.example.dao.NewsDAO;
import com.example.dto.NewsTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private NewsDAO newsDAO;

    @Autowired
    public NewsServiceImpl(NewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }

    @Override
    public ResponseEntity<Void> createNews(NewsTo news) {
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
    public ResponseEntity<Void> updateNews(NewsTo news) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteNews(NewsTo news) {
        return null;
    }
}