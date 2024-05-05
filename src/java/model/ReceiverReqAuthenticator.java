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

/**
 *
 * @author Vikas Raghuvanshi
 */
public class ReceiverReqAuthenticator {
    
    public boolean registration(UserDTO receiver){
        String aadhaar = receiver.getAadhaar();
        String username = receiver.getUsername();
        int age = Integer.parseInt(receiver.getAge());
        String gender = receiver.getGender();
        String bgroup = receiver.getBgroup();
        int units = Integer.parseInt(receiver.getUnits());
        String address = receiver.getAddress();
        String contact = receiver.getContact();
        System.out.println(aadhaar);
        if(!username.trim().equals("")  &&  age<120 && age>0  && units>0){
            String finalAge = Integer.toString(age);
            String finalUnits = Integer.toString(units);
            
            try{
                PreparedStatement pst = null;
                String query1 = "Insert into patient_request (aadhaar_no,username,FinalAge,gender,bgroup,FinalUnits,address,contact) values(?,?,?,?,?,?,?,?)";
                
                Connection con1 = DBConnector.getConnection();
                pst = con1.prepareStatement(query1);
                
                pst.setString(1, aadhaar);
                pst.setString(2,username);
                pst.setString(3,finalAge);
                pst.setString(4,gender);
                pst.setString(5, bgroup);
                pst.setString(6,finalUnits);
                pst.setString(7, address);
                pst.setString(8 , contact);
                
                int i = pst.executeUpdate();
                
                if(i>0){
                    return true;
                }
                
            }
            catch(SQLException e){
                System.out.println(e);
            }
        }
        return false;
    }
    
}
