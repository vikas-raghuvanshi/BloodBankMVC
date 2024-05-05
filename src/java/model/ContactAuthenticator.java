/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vikas Raghuvanshi
 */
public class ContactAuthenticator {
    public boolean IsSubmit(UserDTO user){
        String username = user.getUsername();
        String email = user.getEmail();
        String subject = user.getSubject();
        String message = user.getMessage();
        
        try{
            Statement st = DBConnector.getStatement();
            String query = "Insert into contact (username,email,subject,message) values('"+username+"' , '"+email+"' , '"+subject+"' , '"+message+"' ) ";
            int i = st.executeUpdate(query);

            if(i>0){
                return true;
            }
            
            
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
}
