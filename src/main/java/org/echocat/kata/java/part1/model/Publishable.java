package org.echocat.kata.java.part1.model;

import lombok.Data;

import java.util.List;

@Data
public class Publishable {

    private String title;
    private String isbn;
    private List<Author> authors;
}
