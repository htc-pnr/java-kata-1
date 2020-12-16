package org.echocat.kata.java.part1.service;

import org.echocat.kata.java.part1.io.BookReader;
import org.echocat.kata.java.part1.io.FileReader;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.model.Publishable;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.List;

import static org.echocat.kata.java.part1.io.util.IOConstants.BOOKS_FILE_NAME;

public class BookService implements PublishableService {
    @Override
    public List<Book> read(String fileName) throws FileNotFoundException {

        FileReader reader = new BookReader();
        return reader.read(BOOKS_FILE_NAME);
    }

    @Override
    public void printAll() {

    }

    @Override
    public Publishable findbyIsbn(String isbn) {
        return null;
    }

    @Override
    public List findByAuthor(Author author) {
        return null;
    }

    @Override
    public void addAuthor(Author author) {

    }
}
