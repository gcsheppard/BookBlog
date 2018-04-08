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
        bookManager.addBook("The Hobbit", "J.R.R. Tolkien", "978-0618968633", 
                "What can you say about a classic? Great book. "
                        + "Everyone should read it. Dragons, elves, magic & more...");
        bookManager.addBook("The Black Echo", "Michael Connelly ", "978-0316153614", 
                "LAPD Detective Harry Bosch likes order, contends that there are no coincidences, "
                        + "and keeps meticulous records in his murder book. "
                        + "A real page turner with gutty realism and an unusual twist.");
        bookManager.addBook("Shane", "Jack Schaefer", "978-0544239470", 
                "Roland Smith said: If you read only one western in your life, this is the one. "
                        + "I can't say it better.");
        ServletContext sc = sce.getServletContext();
        sc.setAttribute("bookManager", bookManager);
        
        UserManager userManager = new UserManager();
        userManager.addUser("anna", "pigeon");
        sc.setAttribute("userManager", userManager);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
