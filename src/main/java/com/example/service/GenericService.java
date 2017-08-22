package com.example.service;

import org.springframework.http.ResponseEntity;

public interface GenericService<T> {

    ResponseEntity<T> create(T object);

    ResponseEntity<T> update(T object);

    ResponseEntity<Void> delete(T object);
}