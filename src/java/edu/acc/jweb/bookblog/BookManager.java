package edu.acc.jweb.bookblog;

import java.util.ArrayList;

public class BookManager {
    private final ArrayList<Book> list;
    
    public BookManager () {
        this.list = new ArrayList<>();
    }
    
    public void addBook(String title, String image, String review) {
        Book book = new Book(title, image, review);
        list.add(book);
        while (list.size() > 10) {
            list.remove(0);
        }
    }
    
    public ArrayList<Book> getBooks() {
        return list;
    }
    
}

