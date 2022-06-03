/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db_conncection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author madur
 */
public class DB {
    
    public static Connection connect(){
        
        Connection con = null;
        
        try{
            
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/smart_warehouse","root","");
         
        }catch(ClassNotFoundException | SQLException e){}
        
        return con;
    }
}
