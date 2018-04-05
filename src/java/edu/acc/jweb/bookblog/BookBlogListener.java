package edu.acc.jweb.bookblog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BookBlogListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        BookManager bookManager = new BookManager();
        bookManager.addBook("The Hobbit", "/BookBlog/images/thehobbit.jpg", "What can you say about a classic? Great book. Everyone should read it.");
        ServletContext sc = sce.getServletContext();
        sc.setAttribute("bookManager", bookManager);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
