package com.example.service;

import org.springframework.http.ResponseEntity;

public interface GenericService<T> {

    ResponseEntity<Void> create(T object);

    ResponseEntity<Void> update(T object);

    ResponseEntity<Void> delete(T object);
}