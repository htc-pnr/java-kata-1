package org.echocat.kata.java.part1.model;

import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publishable {

    private String title;
    private String isbn;
    private List<Author> authors;

    public String toString()
    {
        return "Title: "+ this.title + System.lineSeparator()+
                "ISBN: "+ this.isbn + System.lineSeparator()+
                "Authors: " +
                this.authors.stream().map(Author::getMail).collect(Collectors.joining(","))
                +System.lineSeparator();
    }

}
