/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DeleteDonorReqAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */

@WebServlet(name = "DeleteDonorReqChecker", urlPatterns = {"/DeleteDonorReqChecker"})

public class DeleteDonorReqChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aadhaar = request.getParameter("aadhar");
        UserDTO donor = new UserDTO();
        donor.setAadhaar(aadhaar);
        
        DeleteDonorReqAuthenticator donorReq = new DeleteDonorReqAuthenticator();
        boolean deleted=donorReq.isDeleted(donor);
        
        if(deleted){
            request.setAttribute("reqdeletionsuccess", "success");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/donorsrequests.jsp");
            rd.include(request, response);
        }
        else{
            request.setAttribute("reqdeletionfailed", "failed");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/donorsrequests.jsp");
            rd.include(request, response);
        }
    }

       
   
}
