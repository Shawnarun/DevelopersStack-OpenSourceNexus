/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.sql.*;
import java.util.Scanner;
import static sms.Dashboard.*;

public class Search_Student_By_Id {
        private static DB_Connection DB_connection = DB_Connection.get_Instance();
        
        public static void searchStudent() throws Exception{

        Scanner input= new Scanner(System.in);

        System.out.println("                   ------------------");
        System.out.println("                   | Search Student |");  
        System.out.println("                   ------------------\n");
        
        int Id;
        
        do{
        System.out.print("    Enter the Student ID: ");
        
        while (!input.hasNextInt()) {
            title();
            System.out.println("                Invalid input, Try Again!");
            searchStudent();
        }
            Id = input.nextInt();
        }while(false);
        
         
        
        String query = "Select * from Students where Student_id = ?;";
        try(Connection con = DB_connection.dbConnection()){
            
          PreparedStatement ps = con.prepareStatement(query);
          ps.setInt(1, Id);
          
          ResultSet rs = ps.executeQuery();
  
          if(rs.next() && (rs.getString(2)) != null){
              
            String[] fieldNames = {"ID","Name","NIC","Age","Contact","Gender","Department"};
            System.out.println();
              for(int i =1; i<=6;i++)
                  System.out.println((i == 4 || i == 5) ? "      " + fieldNames[i-1] + " -> " + rs.getInt(i) : "      "  + fieldNames[i-1] + " -> " + rs.getString(i));
              
          Scanner in = new Scanner(System.in);
          System.out.print("\n press any letter to go to dashboard ");
           String selection= in.nextLine();
           
            if(selection != null){
                System.out.print("\033[H\033[2J");
                title();
                dashboard();
            }
          }
            else{
            System.out.print("\n  Ops! That Student Id does\'t exist do you want to try again press \"y\" or press any letter to go back to dashboard: ");
                String selection= input.next();
                if(selection.equalsIgnoreCase("y")){
                    System.out.print("\033[H\033[2J");
                    title();
                    searchStudent();
                }
                else {
                    System.out.print("\033[H\033[2J");
                    title();
                    dashboard();
                 }
          }
        }catch(Exception e){
            System.out.println("Error: " + e);
        } 
           
    }
}
