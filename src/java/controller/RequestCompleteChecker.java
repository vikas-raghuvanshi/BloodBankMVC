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
import model.RequestCompleteAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */

@WebServlet(name = "RequestCompelteChecker", urlPatterns = {"/RequestCompelteChecker"})

public class RequestCompleteChecker extends HttpServlet {

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
        String units_req = request.getParameter("units_req");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        String units_given = request.getParameter("units_given");
        
        UserDTO receiverS = new UserDTO();
        
        receiverS.setAadhaar(aadhaar);
        receiverS.setUsername(username);
        receiverS.setAge(age);
        receiverS.setGender(gender);
        receiverS.setBgroup(bgroup);
        receiverS.setUnits_req(units_req);
        receiverS.setAddress(address);
        receiverS.setContact(contact);
        receiverS.setUnits_given(units_given);
        
        RequestCompleteAuthenticator requestS = new RequestCompleteAuthenticator();
        boolean rSuccess = requestS.isCompleted(receiverS);
        
        if(rSuccess){
        //    response.sendRedirect("receivers.jsp");
            request.setAttribute("reqsuccess","success");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/patientrequests.jsp");
            rd.include(request, response);
        }
        else{
        //    response.sendRedirect("patientrequests.jsp");
            request.setAttribute("reqfailed", "failed");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/patientrequests.jsp");
            rd.include(request, response);
        }
        
    }
    
    
    
}
