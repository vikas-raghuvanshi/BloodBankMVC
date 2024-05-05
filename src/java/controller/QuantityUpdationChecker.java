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
import model.QuantityUpdationAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */

@WebServlet(name = "QuantityUpdationChecker", urlPatterns = {"/QuantityUpdationChecker"})

public class QuantityUpdationChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("login.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String bgroup = request.getParameter("bgroup");
       String units = request.getParameter("units");
       String function = request.getParameter("function");
       
       UserDTO update = new UserDTO();
       update.setBgroup(bgroup);
       update.setUnits(units);
       update.setFunction(function);
       
       QuantityUpdationAuthenticator updation = new QuantityUpdationAuthenticator();
       boolean updated = updation.isUpdated(update);
       
       if(updated){
       //    response.sendRedirect("adminhome.jsp");
           request.setAttribute("message1", "success");
           RequestDispatcher rd = getServletContext().getRequestDispatcher("/adminhome.jsp");
           rd.include(request,response);
       }
       else{
       //    response.sendRedirect("donors.jsp");
           request.setAttribute("message2", "failed");
           RequestDispatcher rd = getServletContext().getRequestDispatcher("/adminhome.jsp");
           rd.include(request, response);
       }
    }

  
}
