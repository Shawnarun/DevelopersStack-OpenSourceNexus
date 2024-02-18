/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.sql.*;
import java.util.Scanner;
import static sms.Dashboard.*;

public class View_All_Students {
        private static DB_Connection DB_connection = DB_Connection.get_Instance();
    
        public static void viewAllStudents() throws Exception{

        System.out.println("                   -------------------");
        System.out.println("                   | Student Details |");   
        System.out.println("                   -------------------\n");

        String query = "Select * from Students;";
        try(Connection con = DB_connection.dbConnection()){
            
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(query);
          
          while(rs.next()){
              for(int i =1; i<=7;i++){
                  System.out.println((i == 4 && i == 5) ? "    " + rs.getInt(i) : "    " + rs.getString(i));
              }
              System.out.println("\n -------------------------------------------------------\n");
          }
            
        }catch(Exception e){
            System.out.println("Error:" + e);
        } 

        Scanner input = new Scanner(System.in);
        System.out.print("\n press any letter to go to dashboard ");
            String selection= input.nextLine();
           
            if(selection != null){
                System.out.print("\033[H\033[2J");
                title();
                dashboard();
            }
           
    }
    
}
