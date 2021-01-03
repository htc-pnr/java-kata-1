package org.echocat.kata.java.part1.service;

import org.echocat.kata.java.part1.io.BookReader;
import org.echocat.kata.java.part1.io.MagazineReader;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Publishable;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.echocat.kata.java.part1.util.IOConstants.BOOKS_FILE_NAME;
import static org.echocat.kata.java.part1.util.IOConstants.MAGAZINES_FILE_NAME;

public class PublishableService implements IPublishableService {

    private List<Publishable> publishables;

    @Override
    public List<Publishable> read() throws FileNotFoundException {

        publishables = new BookReader().read(BOOKS_FILE_NAME);
        publishables.addAll(new MagazineReader().read(MAGAZINES_FILE_NAME));
        return publishables;
    }

    @Override
    public void printAll() {

        publishables.forEach(publishable -> System.out.println(publishable.toString()));
    }

    @Override
    public void printAllSorted() {

        publishables.stream()
                    .sorted(Comparator.comparing(Publishable::getTitle))
                    .forEach(publishable -> System.out.println(publishable.toString()));
    }


    @Override
    public Optional<Publishable> findbyIsbn(String isbn) {

        return publishables.stream().filter(x -> x.getIsbn().equals(isbn)).findFirst();
    }

    @Override
    public List<Publishable> findByAuthor(Author author) {

        return  publishables.stream()
                            .filter(x -> x.getAuthors().stream()
                                                       .map(Author::getMail)
                                                       .anyMatch(mail -> mail.equals(author.getMail())))
                            .collect(Collectors.toList());
    }
}
