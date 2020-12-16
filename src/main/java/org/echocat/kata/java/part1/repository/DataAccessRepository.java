package org.echocat.kata.java.part1.repository;

import java.util.List;

public interface DataAccessRepository<T> {

    T update(T t);
    T insert(T t);
    T find(T t);
    List<T> findAll();
}
