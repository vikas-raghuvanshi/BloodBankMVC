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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Vikas Raghuvanshi
 */
public class DonationSuccessfulAuthenticator {
    
    public boolean isDonated(UserDTO donorS){
        
        String aadhaar = donorS.getAadhaar();
        String username = donorS.getUsername();
        int age = Integer.parseInt(donorS.getAge());
        String gender = donorS.getGender();
        String bgroup = donorS.getBgroup();
        String address = donorS.getAddress();
        String contact = donorS.getContact();
        int units_donated = Integer.parseInt(donorS.getUnits_donated());
        
        LocalDate Id = LocalDate.now();
        String date = Id.toString();
        
        LocalTime It = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");
        String time = df.format(It);
        
        if(!username.trim().equals("")  && age<100 && age>0  && units_donated>0){
            String finalAge = Integer.toString(age);
            String finalUnits_donated = Integer.toString(units_donated);
            
            try{
                PreparedStatement pst = null;
                String query1 = "Insert into successful_donation(aadhaar_no,name,age,gender,blood_group,address,contact,units_donated) values(?,?,?,?,?,?,?,?) " ;
                

                Connection con1 = DBConnector.getConnection();
                pst = con1.prepareStatement(query1);
                
                pst.setString(1, aadhaar);
                pst.setString(2, username);
                pst.setString(3, finalAge);
                pst.setString(4, gender);
                pst.setString(5, bgroup);
                pst.setString(6, address);
                pst.setString(7, contact);
                pst.setString(8, finalUnits_donated);
                
                int i = pst.executeUpdate();
                
                if(i>0){
                    try{
                        int toAdd = Integer.parseInt(finalUnits_donated);
                        int toUpdate=0;
                        
                        Statement st = DBConnector.getStatement();
                        
                        String query2 = "Select quantity from blood_availability where blood_group ='"+bgroup+"' ";
                        
                        ResultSet rs = st.executeQuery(query2);
                        
                        if(rs.next()){
                            toUpdate = toAdd + Integer.parseInt(rs.getString(1));
                            
                            try{
                                String query3 = "Update blood_availability set quantity="+toUpdate+" where blood_group='"+bgroup+"' ";
                            
                                int updated = st.executeUpdate(query3);
                                
                                if(updated>0){
                                    try{
                                        String query4 = "Delete from donor_request where aadhaar_no='"+aadhaar+"' ";
                                        
                                        int deleted = st.executeUpdate(query4);
                                        
                                        if(deleted>0){
                                            try{
                                                String query5 = "Insert into bloodbank_history(aadhaar_no,updated_by,action,blood_group,units,on_date,time_recorded) values(?,?,?,?,?,?,?) ";
                                                
                                                pst = con1.prepareStatement(query5);
                                                
                                                pst.setString(1,aadhaar);
                                                pst.setString(2, "Donor");
                                                pst.setString(3, "Donated");
                                                pst.setString(4, bgroup);
                                                pst.setInt(5, units_donated);
                                                pst.setString(6, date);
                                                pst.setString(7, time);
                                                
                                                int j = pst.executeUpdate();
                                                
                                                if(j>0){
                                                    return true;
                                                }
                                            }   
                                            catch(SQLException e){
                                                System.out.println(e);
                                            }
                                        }
                                    }
                                    catch(SQLException e){
                                        System.out.println(e);
                                    }
                                }
                            }
                            catch(SQLException e){
                                System.out.println(e);
                            }
                        }
                    }
                    catch(SQLException e){
                        System.out.println(e);
                    }
                }
                
            }
            catch(SQLException e){
                System.out.println(e);
            }
           
        }
        return false;
    }
}
