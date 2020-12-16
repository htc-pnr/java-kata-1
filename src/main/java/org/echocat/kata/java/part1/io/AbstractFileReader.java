package org.echocat.kata.java.part1.io.util;

import org.echocat.kata.java.part1.io.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractFileReader implements FileReader {

    @Override
    public List read(String fileName) throws FileNotFoundException{

        List records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {

            scanner.nextLine();

            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }

        return records;
    }

    protected abstract Object getRecordFromLine(String nextLine);

}
