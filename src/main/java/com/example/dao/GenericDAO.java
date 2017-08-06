package com.example.dao;

import java.util.Optional;

public interface GenericDAO<T> {

    Optional<T> create(T object);

    Optional<T> readById(Long id);

    Optional<T> update(T object);

    boolean delete(T object);

}