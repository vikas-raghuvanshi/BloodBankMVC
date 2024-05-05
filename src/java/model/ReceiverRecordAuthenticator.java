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
import java.util.Locale;

/**
 *
 * @author Vikas Raghuvanshi
 */
public class ReceiverRecordAuthenticator {
    public boolean isCompleted(UserDTO receiverS){
        String  aadhaar = receiverS.getAadhaar();
        String username = receiverS.getUsername();
        int age = Integer.parseInt(receiverS.getAge());
        String gender = receiverS.getGender();
        String bgroup = receiverS.getBgroup();
        int units_req = Integer.parseInt(receiverS.getUnits_req());
        String address = receiverS.getAddress();
        String contact = receiverS.getContact();
        int units_given = Integer.parseInt(receiverS.getUnits_given());
        
        LocalDate ld = LocalDate.now();
        String date = ld.toString();
        
        LocalTime lt = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");
        String time = df.format(lt);
        
        if(!username.trim().equals("") && age<120 && age>0 && units_req>0 && units_given<=units_req){
            String finalAge = Integer.toString(age);
            try{
                PreparedStatement pst = null;
                String query1 = "Insert into request_completed(aadhaar_no,name,age,gender,blood_group,units_required,address,contact,units_given) values(?,?,?,?,?,?,?,?,?)";
                
                Connection con1 = DBConnector.getConnection();
                pst = con1.prepareStatement(query1);
                
                pst.setString(1, aadhaar);
                pst.setString(2,username);
                pst.setString(3, finalAge);
                pst.setString(4,gender);
                pst.setString(5,bgroup);
                pst.setInt(6, units_req);
                pst.setString(7, address);
                pst.setString(8,contact);
                pst.setInt(9, units_given);
                
                int i = pst.executeUpdate();
                
                if(i>0){
                    try{
                        int toUpdate=0;
                        Statement st = DBConnector.getStatement();
                        String query2 = "Select quantity from blood_availability where blood_group='"+bgroup+"' ";
                        ResultSet rs = st.executeQuery(query2);
                        
                        if(rs.next()){
                            int avail_quant = Integer.parseInt(rs.getString(1));
                            if(avail_quant < units_given){
                                return false;
                            }
                            
                            toUpdate = avail_quant - units_given;
                            
                            try{
                                String query3 = "Update blood_availability set quantity="+toUpdate+" where blood_group='"+bgroup+"' ";
                                int updated = st.executeUpdate(query3);
                                
                                if(updated>0){
                                    try{
                                        String query4 = "Insert into bloodbank_history(aadhaar_no,updated_by,action,blood_group,units,on_date,time_recorded) values(?,?,?,?,?,?,?) ";
                                        
                                        pst = con1.prepareStatement(query4);
                                        
                                        pst.setString(1, aadhaar);
                                        pst.setString(2, "Receiver");
                                        pst.setString(3,"Received");
                                        pst.setString(4, bgroup);
                                        pst.setInt(5, units_given);
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
        
        return false;
    }   
}
