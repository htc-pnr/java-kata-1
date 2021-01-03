package org.echocat.kata.java.part1.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.echocat.kata.java.part1.util.IOConstants.SEMICOLON_DELIMITER;

public abstract class AbstractFileReader implements IFileReader {

    @Override
    public List read(String fileName) throws FileNotFoundException{

        List records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {

            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                records.add(getRecordFromLine(Arrays.asList(line.split(SEMICOLON_DELIMITER))));
            }
        }

        return records;
    }

    protected abstract Object getRecordFromLine(List<String> cells);

}
