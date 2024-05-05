/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dto.UserDTO;
import model.LoginAuthenticator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;

/**
 *
 * @author Vikas Raghuvanshi
 */
public class LoginChecker extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        UserDTO user = new UserDTO();
        user.setUsername(username);
        user.setPassword(password);
        
        LoginAuthenticator la =new LoginAuthenticator();
        boolean login = la.isLogin(user);
        if(login){ 
             HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            request.setAttribute("loginsuccessful", "success");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/adminhome.jsp");
            rd.include(request, response);
        }
        else
        {
            request.setAttribute("loginfailed", "failed");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
            rd.include(request, response);
        }
    }
   

    
}
