package org.echocat.kata.java.part1.io;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.List;

public interface IFileReader {

    List read(String fileName) throws FileNotFoundException;
}
