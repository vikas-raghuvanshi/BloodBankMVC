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
import model.DonationSuccessfulAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */

@WebServlet(name = "DonationSuccessfulChecker", urlPatterns = {"/DonationSuccessfulChecker"})

public class DonationSuccessfulChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.sendRedirect("login.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aadhaar = request.getParameter("aadhaar");
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String bgroup = request.getParameter("bgroup");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        String units_donated = request.getParameter("units_donated");
        
        UserDTO donorS = new UserDTO();
        
        donorS.setAadhaar(aadhaar);
        donorS.setUsername(username);
        donorS.setAge(age);
        donorS.setGender(gender);
        donorS.setBgroup(bgroup);
        donorS.setAddress(address);
        donorS.setContact(contact);
        donorS.setUnits_donated(units_donated);
        
        DonationSuccessfulAuthenticator  donationS = new DonationSuccessfulAuthenticator();
        boolean dSuccess = donationS.isDonated(donorS);
        
        if(dSuccess){
  //         response.sendRedirect("donors.jsp");
           request.setAttribute("donationsuccess", "success");
           RequestDispatcher rd = getServletContext().getRequestDispatcher("/donorsrequests.jsp");
           rd.include(request, response);
        }
        else{
 //        response.sendRedirect("donorsrequests.jsp");\
           request.setAttribute("donationfailed", "failed");
           RequestDispatcher rd = getServletContext().getRequestDispatcher("/donorsrequests.jsp");
           rd.include(request, response);
        }
    }   
}