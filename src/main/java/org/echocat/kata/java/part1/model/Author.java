package org.echocat.kata.java.part1.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Author {

    private String mail;
    private String firstName;
    private String lastName;

}
