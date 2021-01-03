package org.echocat.kata.java.part1.io;


import org.echocat.kata.java.part1.model.Author;
import java.util.List;

public class AuthorReader extends AbstractFileReader {

    @Override
    protected Object getRecordFromLine(List<String> cells){

        return  Author.builder().mail(cells.get(0))
                    .firstName(cells.get(1))
                    .lastName(cells.get(2))
                    .build();

    }
}
