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
import model.DeletePatientReqAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */
@WebServlet(name = "DeletePatientReqChecker", urlPatterns = {"/DeletePatientReqChecker"})

public class DeletePatientReqChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aadhaar = request.getParameter("aadhar");
        
        UserDTO patient = new UserDTO();
        patient.setAadhaar(aadhaar);
        
        DeletePatientReqAuthenticator patientReq = new DeletePatientReqAuthenticator();
        boolean deleted = patientReq.isDeleted(patient);
        
        if(deleted){
  //          response.sendRedirect("patientrequests.jsp");
            request.setAttribute("reqdeletionsuccess","success");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/patientrequests.jsp");
            rd.include(request,response);
        }
        else{
 //         response.sendRedirect("adminhome.jsp");
            request.setAttribute("reqdeletionfailed","failed");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/patientrequests.jsp");
            rd.include(request,response);
        }
    }
    
   
}
