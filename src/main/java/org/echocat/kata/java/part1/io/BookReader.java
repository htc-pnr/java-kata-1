package org.echocat.kata.java.part1.io;


import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.echocat.kata.java.part1.util.IOConstants.COMMA_DELIMITER;

public class BookReader extends AbstractFileReader {

    protected Book getRecordFromLine(List<String> cells) {

        String[] authorMails = cells.get(2).split(COMMA_DELIMITER);
        List<Author> authors =    Arrays.stream(authorMails)
                .map(mail -> Author.builder().mail(mail).build())
                .collect(Collectors.toList());

        return Book.builder().title(cells.get(0))
                      .isbn(cells.get(1))
                      .authors(authors)
                      .description(cells.get(3))
                      .build();
    }
}
