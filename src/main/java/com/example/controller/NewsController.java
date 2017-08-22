package com.example.controller;

import com.example.dto.NewsTo;
import com.example.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/news", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class NewsController {

    private NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping
    public ResponseEntity<NewsTo> createNews(@RequestBody NewsTo news) {

        return newsService.create(news);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<NewsTo> getNewsById(@PathVariable Long id) {

        return newsService.getNewsById(id);
    }

    @GetMapping(params = {"title"})
    public ResponseEntity<NewsTo> getNewsByTitle(@RequestParam String name) {

        return newsService.getNewsByTitle(name);
    }

    @GetMapping
    public ResponseEntity<List<NewsTo>> getNewsList() {

        return newsService.getNewsList();
    }

    @PutMapping
    public ResponseEntity<NewsTo> updateNews(@RequestBody NewsTo news) {

        return newsService.update(news);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteNews(@RequestBody NewsTo news) {

        return newsService.delete(news);
    }
}