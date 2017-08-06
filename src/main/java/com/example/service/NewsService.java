package com.example.service;

import com.example.dto.NewsTo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NewsService {

    ResponseEntity<Void> createNews(NewsTo news);

    ResponseEntity<NewsTo> getNewsById(Long id);

    ResponseEntity<NewsTo> getNewsByTitle(String name);

    ResponseEntity<List<NewsTo>> getNewsList();

    ResponseEntity<Void> updateNews(NewsTo news);

    ResponseEntity<Void> deleteNews(NewsTo news);
}