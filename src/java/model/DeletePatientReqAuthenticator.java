/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.UserDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vikas Raghuvanshi
 */
public class DeletePatientReqAuthenticator {
    public boolean isDeleted(UserDTO patient){
        String aadhaar = patient.getAadhaar();
        try{
            Statement st = DBConnector.getStatement();
            String query = "Delete from patient_request where aadhaar_no = '"+aadhaar+"' ";
            int deleted = st.executeUpdate(query);
            if(deleted>0){
                return true;
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
}
