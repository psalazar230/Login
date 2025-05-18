/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author Pedro's Workstation
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:msql://localhost:3306/cms?useSSL=false","root","ZfQg5nG$!c");
            return con;        
        }            
        catch(Exception e){
            return null;
        }
        
    }
    
}
