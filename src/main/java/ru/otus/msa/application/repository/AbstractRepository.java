package ru.otus.otusmsa.application.repository;

import java.util.List;

/**
 * @author Andrei Durkin <a.durkin@goodt.me> at 12.05.2024
 */

public interface AbstractRepository<T> {

    T save(T o);

    boolean delete(int id);

    T get(int id);

    List<T> getAll();


}
