package org.echocat.kata.java.part1.model;

import lombok.*;

@Data
@ToString
@Builder
public class Author {

    private String mail;
    private String firstName;
    private String lastName;

}
