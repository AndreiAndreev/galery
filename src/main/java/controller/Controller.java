package controller;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.process(req, resp);
    }

    protected void process(HttpServletRequest req, HttpServletResponse resp){
        User newUser = new User(3, req.getParameter("firstName"),
                                req.getParameter("lastName"),
                                req.getParameter("email"),
                                req.getParameter("password"));
        System.out.println(newUser);
    }
}
