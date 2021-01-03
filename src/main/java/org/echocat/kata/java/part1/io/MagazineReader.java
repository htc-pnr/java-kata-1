package org.echocat.kata.java.part1.io;

import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Magazine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.echocat.kata.java.part1.util.IOConstants.COMMA_DELIMITER;
import static org.echocat.kata.java.part1.util.DateHelper.parseToDate;

public class MagazineReader extends AbstractFileReader {

    @Override
    protected Object getRecordFromLine(List<String> cells) {

        Magazine magazine = new Magazine();

        magazine.setTitle(cells.get(0));
        magazine.setIsbn(cells.get(1));

        String authorLine = cells.get(2);
        String[] authorMails = authorLine.split(COMMA_DELIMITER);
        List<Author> authors = new ArrayList<>();

        Arrays.stream(authorMails).forEach(mail -> authors.add(Author.builder().mail(mail).build()));

        magazine.setAuthors(authors);
        magazine.setPublishDate(parseToDate (cells.get(3)));

        return magazine;
    }
}
