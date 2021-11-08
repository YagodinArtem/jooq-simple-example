package ru.yagodin.jooq.repository;

import org.jooq.Condition;

import java.util.List;

public interface CrudRepository<T> {

    T save(T t);

    T get(String title);

    List<T> findAll(Condition condition);
}
