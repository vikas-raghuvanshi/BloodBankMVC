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
import javax.servlet.http.HttpSession;
import model.DonationReqAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */

@WebServlet(name = "DonationReqChecker", urlPatterns = {"/DonationReqChecker"})

public class DonationReqChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        String aadhaar = request.getParameter("aadhar");
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String bgroup = request.getParameter("bgroup");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        
        
        
        UserDTO donor = new UserDTO();
        donor.setAadhaar(aadhaar);
        donor.setUsername(username);
        donor.setAge(age);
        donor.setGender(gender);
        donor.setBgroup(bgroup);
        donor.setAddress(address);
        donor.setContact(contact);
        
        DonationReqAuthenticator donorReq = new DonationReqAuthenticator();
        boolean registered = donorReq.isRegister(donor);
        
        if(registered){
            HttpSession session = request.getSession(true);
         //   session.setAttribute("aadhaar", aadhaar);
            response.sendRedirect("registered.jsp");
        }
        else{
         //   response.sendRedirect("login.jsp");
           request.setAttribute("donorregistrationfailed", "failed");
           RequestDispatcher rd = getServletContext().getRequestDispatcher("/webhome.jsp");
           rd.include(request,response);
        }
    }
    
    
}
