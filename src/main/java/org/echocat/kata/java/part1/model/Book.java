package org.echocat.kata.java.part1.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Book extends Publishable{

    private String description;

    @Builder
    public Book(String title, String isbn, List<Author> authors, String description) {
        super(title, isbn, authors);
        this.description = description;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Description : " + this.description + System.lineSeparator();
    }
}
