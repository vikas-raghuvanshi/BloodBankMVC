/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vikas Raghuvanshi
 */
public class DBConnector {
    private static Connection con = null;
    private static Statement st = null;


    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "root");
            System.out.println("Connected");
            
            st=con.createStatement();
        }
        catch(ClassNotFoundException  | SQLException e){
            System.out.println(e);
        }
    
    }
    
    public static Connection getConnection(){
        return con;
    }
    public static Statement getStatement(){
        return st;
    }
}
