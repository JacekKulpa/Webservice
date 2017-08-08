package com.example.dao;

import javax.persistence.*;
import java.lang.reflect.ParameterizedType;
import java.util.Optional;

public abstract class GenericDAO<T> {

    @PersistenceUnit
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    private Class<T> type;

    @SuppressWarnings("unchecked")
    GenericDAO() {

        type = (Class<T>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    Optional<T> create(T object) throws PersistenceException {

        entityManager = emf.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(object);

        transaction.commit();

        entityManager.close();

        return Optional.of(object);

    }

    Optional<T> readById(Long id) {

        entityManager = emf.createEntityManager();

        T object = entityManager.find(type, id);

        entityManager.close();

        return Optional.ofNullable(object);

    }

    Optional<T> update(T object) throws PersistenceException{

        entityManager = emf.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        T newObject = entityManager.merge(object);

        transaction.commit();

        entityManager.close();

        return Optional.of(newObject);
    }

    boolean delete(T object) {

        entityManager = emf.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.remove(object);

        transaction.commit();

        entityManager.close();

        return true;
    }
}