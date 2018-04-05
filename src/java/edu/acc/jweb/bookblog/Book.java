package edu.acc.jweb.bookblog;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    public String title;
    public String image;
    public String review;
    public Date date;
    
    public Book (String title, String image, String review) {
        this.title = title;
        this.image = image;
        this.review = review;
        this.date = new Date();
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getImage() {
        return this.image;
    }
    
    public String getReview() {
        return this.review;
    }
    
    public String getDate() {
        Format formatter = new SimpleDateFormat("MM/dd/yyyy");
        String string = formatter.format(this.date);
        return string;
    }
}
