package org.echocat.kata.java.part1.io;


import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.echocat.kata.java.part1.io.util.IOConstants.COMMA_DELIMITER;
import static org.echocat.kata.java.part1.io.util.IOConstants.SEMICOLON_DELIMITER;

public class BookReader extends AbstractFileReader {


    protected Book getRecordFromLine(String line) {

        Book book = new Book();

        try (Scanner rowScanner = new Scanner(line)) {

            rowScanner.useDelimiter(SEMICOLON_DELIMITER);

            while (rowScanner.hasNext()) {
                book.setTitle(rowScanner.next());
                book.setIsbn(rowScanner.next());

                String authorLine = rowScanner.next();
                String[] authorMails = authorLine.split(COMMA_DELIMITER);
                List<Author> authors = new ArrayList<Author>();

                Arrays.stream(authorMails).forEach( mail ->
                        {
                            Author author = new Author();
                            author.setMail(mail);
                            authors.add(author);
                        }
                );

                book.setAuthors(authors);
                book.setDescription(rowScanner.next());

            }
        }
        return book;
    }
}
