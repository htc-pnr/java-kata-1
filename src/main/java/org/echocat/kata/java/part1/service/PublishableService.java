package org.echocat.kata.java.part1.service;

import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Publishable;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.List;

public interface PublishableService {

    List read(String fileName) throws FileNotFoundException;
    void printAll();
    Publishable findbyIsbn(String isbn);
    List findByAuthor(Author author);
    void addAuthor(Author author);

}
