package org.echocat.kata.java.part1;
import org.echocat.kata.java.part1.io.BookReader;
import org.echocat.kata.java.part1.io.FileReader;
import org.echocat.kata.java.part1.io.MagazineReader;
import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.model.Magazine;
import org.echocat.kata.java.part1.service.BookService;
import org.echocat.kata.java.part1.service.PublishableService;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.List;

import static org.echocat.kata.java.part1.io.util.IOConstants.BOOKS_FILE_NAME;
import static org.echocat.kata.java.part1.io.util.IOConstants.MAGAZINES_FILE_NAME;

public class MainApp {

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        System.out.println(getHelloWorldText());

        PublishableService service = new BookService();
        List<Book> books =  service.read(BOOKS_FILE_NAME);

        for(Book book: books)
        {
            System.out.println(book.getTitle());
        }



    }

    protected static String getHelloWorldText() {
        return "Hello world!";
    }


    //Read csv
    //Load to memory list
    //print lists
    //sort by title
    //find by isbn
    //find by author's email
}
