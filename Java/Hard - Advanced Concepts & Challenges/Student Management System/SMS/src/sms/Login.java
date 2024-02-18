/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.sql.*;
import java.util.Scanner;
import static sms.Dashboard.*;


//login Page
public class Login {
    private static DB_Connection DB_connection = DB_Connection.get_Instance();
            
    public static void login() throws Exception {
        Scanner input = new Scanner(System.in); 
        System.out.println("                   ----------------");
        System.out.println("                   |     Login     |");  
        System.out.println("                   ----------------\n");
        
        System.out.print("    Enter your username : ");
        String username = input.nextLine();
        System.out.print("    Enter your password : ");
        String password = input.nextLine();
        
        try(Connection con = DB_connection.dbConnection()){
          CallableStatement cs = con.prepareCall("call User_Authentication(?,?)");
          cs.setString(1, username);
          cs.setString(2, password);
          
          
          ResultSet rs = cs.executeQuery();
           
          if( rs.next() && (rs.getString(2)) != null){     
              title();
              dashboard();
          }else{
              System.out.print("\033[H\033[2J");
              System.out.flush();
              title();
              System.out.println("    Invalid username or password, Try Again!\n");
              login();
          }
            
        }catch(Exception e){
            System.out.println("Error:" + e);
        } 
        
    }
}
