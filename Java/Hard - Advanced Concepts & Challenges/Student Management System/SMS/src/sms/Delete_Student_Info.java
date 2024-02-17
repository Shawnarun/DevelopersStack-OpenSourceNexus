/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.sql.*;
import java.util.Scanner;
import static sms.Dashboard.*;

/**
 *
 * @author Game Zone Tech
 */
public class Delete_Student_Info {
        private static DB_Connection DB_connection = DB_Connection.get_Instance();
    
        public static void removeStudent(){

        Scanner input = new Scanner(System.in);

        System.out.println("                   ------------------");
        System.out.println("                   | Remove Student |");  
        System.out.println("                   ------------------\n");

        int id;
        
        do{
        System.out.print("    Enter the Student ID: ");
        
        while (!input.hasNextInt()) {
            title();
            System.out.println("                Invalid input, Try Again!");
            removeStudent();
        }
            id = input.nextInt();
        }while(false);
        
        
        String query = "Select * from Students where student_id = ?;";
        try(Connection con = DB_connection.dbConnection()){
            
          PreparedStatement ps = con.prepareStatement(query);
          ps.setInt(1, id);
          
          ResultSet rs = ps.executeQuery();
          
          if( rs.next() && (rs.getString(2)) != null){   
              String[] fieldNames = {"Name","NIC","Age","Contact","Gender","Department"};
              for(int i =2; i<=7;i++){
                  System.out.println((i == 4 || i == 5) ? "     "+ (i-1) + " " + fieldNames[i-2] + "-> " + rs.getInt(i) : "     "+ (i-1) + " " + fieldNames[i-2] + "-> " + rs.getString(i));
              }
              
              System.out.print("\n   Do you really want to delete this student info? \n   Press \"y\" if you want to delete or press any letter to go to dashboard : ");
              String choice = input.nextLine();
              choice = input.nextLine();
              
              if(choice.equalsIgnoreCase("y")){
              String deleteSql = "delete from Students where Student_id = ?;";
              PreparedStatement ps2 = con.prepareStatement(deleteSql);
              ps2.setInt(1, id);
              ps2.executeUpdate();
              
              System.out.print("\n Successfully Deleted!!!\n Press any letter to go to dashboard ");
              String selection = input.nextLine();
              if(selection != null){
                System.out.print("\033[H\033[2J");
                title();
                dashboard();
              }

              }else{
                  System.out.print("\033[H\033[2J");
                    title();
                    dashboard();
              } 
          }else{
            System.out.print("\n  Ops! That Student Id does\'t exist do you want to try again press \"y\" or press any letter to go back to dashboard: ");
                String selection= input.nextLine();
                selection= input.nextLine();
                if(selection.equalsIgnoreCase("y")){
                    System.out.print("\033[H\033[2J");
                    title();
                    removeStudent();
                }
                else {
                    System.out.print("\033[H\033[2J");
                    title();
                    dashboard();
                 }
          }
        }catch(Exception e){
            System.out.println("Error:" + e);
        } 
                   
    }
    
}
