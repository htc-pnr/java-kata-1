package org.echocat.kata.java.part1.service;

import org.echocat.kata.java.part1.io.BookReader;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import static org.echocat.kata.java.part1.util.IOConstants.BOOKS_FILE_NAME;

public class BookService implements IPublishableService {

    List<Book> books;

    @Override
    public List<Book> read() throws FileNotFoundException {

        books = new BookReader().read(BOOKS_FILE_NAME);
        return books;
    }

    @Override
    public void printAll() {

        books.forEach(book -> System.out.println(book.toString()));
    }

    @Override
    public void printAllSorted() {

    }

    @Override
    public Optional<Book> findbyIsbn(String isbn) {
        return null;
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        return null;
    }
}
