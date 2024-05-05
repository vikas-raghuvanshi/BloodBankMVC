/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ContactAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */
public class ContactChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("contact.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        
        UserDTO user = new UserDTO();
        
        user.setUsername(username);
        user.setEmail(email);
        user.setSubject(subject);
        user.setMessage(message);
        
        ContactAuthenticator la = new ContactAuthenticator();
        boolean submit = la.IsSubmit(user);
        
        if(submit){
            request.setAttribute("contactsuccess", "success");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/contact.jsp");
            rd.include(request,response);
        }
        else{
            request.setAttribute("contactfailed", "failed");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/contact.jsp");
            rd.include(request,response);
        }
    }

   
}
