package org.echocat.kata.java.part1.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Magazine extends  Publishable{
    private LocalDate publishDate;
}
