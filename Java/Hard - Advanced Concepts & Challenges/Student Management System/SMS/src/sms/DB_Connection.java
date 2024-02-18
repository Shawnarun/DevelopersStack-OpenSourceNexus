/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;
import java.sql.*;

public class DB_Connection {
    private static DB_Connection instance;
    
    private DB_Connection(){   
    }
    
    public static synchronized DB_Connection get_Instance(){
        if(instance == null){
            instance = new DB_Connection();
        }
        return instance;
    }
    
    public Connection dbConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String Url = "jdbc:mysql://localhost:3306/SMS";
        String Username = "root"; //Username
        String password = ""; //Password
        
        Connection con = DriverManager.getConnection(Url,Username,password);
        return con;
    }
    
}
