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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DeleteReceiverAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */

@WebServlet(name = "DeleteReceiverChecker", urlPatterns = {"/DeleteReceiverChecker"})

public class DeleteReceiverChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pid = request.getParameter("pid");
        UserDTO receiver = new UserDTO();
        receiver.setPid(pid);
        
        DeleteReceiverAuthenticator receiverDeletion = new DeleteReceiverAuthenticator();
        boolean deleted = receiverDeletion.isDeleted(receiver);
        
        if(deleted){
            request.setAttribute("receiverdeletionsuccess", "success");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/receivers.jsp");
            rd.include(request,response);
        }
        else{
            request.setAttribute("receiverdeletionfailed", "failed");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/receivers.jsp");
            rd.include(request,response);
        }
    }
    
}
