package edu.acc.jweb.bookblog;

import java.util.ArrayList;

public class BookManager {
    private final ArrayList<Book> list;
    
    public BookManager () {
        this.list = new ArrayList<>();
    }
    
    public void addBook(String title, String author, String isbn, String review) {
        Book book = new Book(title, author, isbn, review);
        list.add(book);
        while (list.size() > 10) {
            list.remove(0);
        }
    }
    
    public ArrayList<Book> getBooks() {
        return list;
    }
    
    public String validBook(Book book) {
        String errors = "";
        
        if (book.title.isEmpty()) errors = errors + "Title not entered.<br>";
        if (book.author.isEmpty()) errors = errors + "Author not entered.<br>";
        if (book.isbn.isEmpty()) errors = errors + "ISBN not entered.<br>";
        if (book.review.isEmpty()) errors = errors + "Review not entered.<br>";
        if (!errors.isEmpty()) errors = "Error(s):<br>" + errors;
        
        return errors;
    }
}

