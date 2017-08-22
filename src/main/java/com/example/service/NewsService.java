package com.example.service;

import com.example.dto.NewsTo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NewsService extends GenericService<NewsTo> {

    @Override
    ResponseEntity<NewsTo> create(NewsTo object);

    ResponseEntity<NewsTo> getNewsById(Long id);

    ResponseEntity<NewsTo> getNewsByTitle(String name);

    ResponseEntity<List<NewsTo>> getNewsList();

    @Override
    ResponseEntity<NewsTo> update(NewsTo object);

    @Override
    ResponseEntity<Void> delete(NewsTo object);
}