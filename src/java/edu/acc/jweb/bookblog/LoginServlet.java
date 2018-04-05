package edu.acc.jweb.bookblog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    public String flash;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");
        User user = new User(username, password);
        UserManager userManager = (UserManager) getServletContext().getAttribute("userManager");
        user = userManager.validateUser(user);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            flash = "";
            request.setAttribute("flash", flash);
            getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);   
        }
        else {
            flash = "Login failed.";
            request.setAttribute("flash", flash);
            getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);   
        }
                         
    }
}
