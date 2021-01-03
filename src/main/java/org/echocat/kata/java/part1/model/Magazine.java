package org.echocat.kata.java.part1.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Magazine extends  Publishable{
    private LocalDate publishDate;

    @Builder
    public Magazine(String title, String isbn, List<Author> authors, LocalDate publishDate) {
        super(title, isbn, authors);
        this.publishDate = publishDate;
    }

    public String toString()
    {
        return super.toString() + "Publish date : " + this.publishDate + System.lineSeparator();
    }
}
