package org.echocat.kata.java.part1.service;

import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Magazine;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

public class MagazineService implements IPublishableService {

    @Override
    public List<Magazine> read() throws FileNotFoundException {
        return null;
    }

    @Override
    public void printAll() {

    }

    @Override
    public void printAllSorted() {

    }

    @Override
    public Optional<Magazine> findbyIsbn(String isbn) {
        return null;
    }

    @Override
    public List<Magazine> findByAuthor(Author author) {
        return null;
    }

}
