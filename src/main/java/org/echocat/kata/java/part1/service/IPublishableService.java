package org.echocat.kata.java.part1.service;

import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Publishable;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

public interface IPublishableService {

    List<? extends Publishable> read() throws FileNotFoundException;
    void printAll();
    void printAllSorted();
    Optional<? extends Publishable> findbyIsbn(String isbn);
    List<? extends Publishable> findByAuthor(Author author);

}
