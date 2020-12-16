package org.echocat.kata.java.part1.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateHelper {
    public static LocalDate parseToDate(String dateStr)
    {
        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
