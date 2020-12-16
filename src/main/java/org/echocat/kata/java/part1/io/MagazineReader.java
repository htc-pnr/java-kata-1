package org.echocat.kata.java.part1.io;

import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Magazine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.echocat.kata.java.part1.io.util.IOConstants.COMMA_DELIMITER;
import static org.echocat.kata.java.part1.io.util.IOConstants.SEMICOLON_DELIMITER;
import static org.echocat.kata.java.part1.util.DateHelper.parseToDate;

public class MagazineReader extends AbstractFileReader{

    @Override
    protected Object getRecordFromLine(String line) {

        Magazine magazine = new Magazine();

        try (Scanner rowScanner = new Scanner(line)) {

            rowScanner.useDelimiter(SEMICOLON_DELIMITER);

            while (rowScanner.hasNext()) {
                magazine.setTitle(rowScanner.next());
                magazine.setIsbn(rowScanner.next());

                String authorLine = rowScanner.next();
                String[] authorMails = authorLine.split(COMMA_DELIMITER);
                List<Author> authors = new ArrayList<Author>();

                Arrays.stream(authorMails).forEach(mail ->
                        {
                            Author author = new Author();
                            author.setMail(mail);
                            authors.add(author);
                        }
                );

                magazine.setAuthors(authors);
                magazine.setPublishDate(parseToDate (rowScanner.next()));

            }
        }
        return magazine;
    }
}
