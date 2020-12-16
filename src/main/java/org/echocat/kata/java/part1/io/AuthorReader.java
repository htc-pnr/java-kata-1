package org.echocat.kata.java.part1.io;


import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Magazine;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.echocat.kata.java.part1.io.util.IOConstants.COMMA_DELIMITER;
import static org.echocat.kata.java.part1.io.util.IOConstants.SEMICOLON_DELIMITER;

public class AuthorReader extends AbstractFileReader {

    @Override
    protected Object getRecordFromLine(String line){

        Author author = new Author();

        try (Scanner rowScanner = new Scanner(line)) {

            rowScanner.useDelimiter(SEMICOLON_DELIMITER);

            while (rowScanner.hasNext()) {
                author.setMail(rowScanner.next());
                author.setFirstName(rowScanner.next());
                author.setLastName(rowScanner.next());

            }
        }
        return author;
    }
}
