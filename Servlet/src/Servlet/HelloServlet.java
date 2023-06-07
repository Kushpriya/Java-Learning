package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// "/hello"
@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        //this will run when browser return Method is "GET"
        req.getRequestDispatcher("index.jsp").forward(req,res);
    }
}
