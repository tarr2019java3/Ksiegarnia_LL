package pl.sda.ksiegarnia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Cos","Jan ", "horror") ;
        Book book1 = new Book("Coś innego", "Marcin","dramat") ;
        Book book2 = new Book("Zycie lwa ","Mariusz ","przyrodnicza") ;
        Book book3 = new Book("czarodziejskie coś","Krzysztof","fantastyka") ;
        Book book4 = new Book("cos jeszcze innego", "Magda","powiesc") ;
        ObjectMapper objectMapper = new ObjectMapper() ;
        List<Book>bookList =new ArrayList<>() ;
        bookList.add(book) ;
        bookList.add(book1) ;
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        try {
            objectMapper.writeValue(new File("ksiazki.json"), bookList);
            objectMapper.writeValue(new File("book.json"), book);
            objectMapper.writeValue(new File("book1.json"),book1);
            objectMapper.writeValue(new File("book2.json"), book2);
            objectMapper.writeValue(new File("book3.json"), book3);
            objectMapper.writeValue(new File("book4.json"), book4);
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }

