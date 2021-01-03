package org.echocat.kata.java.part1;
import org.echocat.kata.java.part1.service.IPublishableService;
import org.echocat.kata.java.part1.service.PublishableService;

import java.io.FileNotFoundException;

public class MainApp {

    public static void main(String[] args) throws FileNotFoundException{

        IPublishableService service = new PublishableService();

        service.read();
        service.printAllSorted();
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
