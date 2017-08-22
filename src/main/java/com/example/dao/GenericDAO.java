package com.example.dao;

import javax.persistence.*;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

public abstract class GenericDAO<T> {

    @PersistenceUnit
    protected EntityManagerFactory emf;

    private EntityManager entityManager;

    private Class<T> type;

    @SuppressWarnings("unchecked")
    GenericDAO() {

        type = (Class<T>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public Optional<T> create(T object) throws PersistenceException {

        entityManager = emf.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(object);

        transaction.commit();

        entityManager.close();

        return Optional.of(object);

    }

    public Optional<T> readById(Long id) {

        entityManager = emf.createEntityManager();

        T object = entityManager.find(type, id);

        entityManager.close();

        return Optional.ofNullable(object);

    }

    public Optional<T> update(T object) throws PersistenceException {

        entityManager = emf.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        T newObject = entityManager.merge(object);

        transaction.commit();

        entityManager.close();

        return Optional.of(newObject);
    }

    public boolean delete(T object) {

        entityManager = emf.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.remove(object);

        transaction.commit();

        entityManager.close();

        return true;
    }

    public Optional<T> readByLogin(String login) {

        TypedQuery<T> namedQuery = emf.createEntityManager().createNamedQuery("User.findByLogin", type);

        namedQuery.setParameter("login", login);

        return Optional.of(namedQuery.getSingleResult());
    }

    public Optional<List<T>> readAll() {

        TypedQuery<T> namedQuery = emf.createEntityManager().createNamedQuery("User.findAll", type);

        return Optional.of(namedQuery.getResultList());
    }
}