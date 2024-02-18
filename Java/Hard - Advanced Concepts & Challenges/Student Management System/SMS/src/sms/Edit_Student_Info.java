/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.sql.*;
import java.util.Scanner;
import static sms.Dashboard.*;

public class Edit_Student_Info {
     private static DB_Connection DB_connection = DB_Connection.get_Instance();
     
     public static void editStudent() throws Exception{

        System.out.println("                   ----------------");
        System.out.println("                   | Edit Student |");  
        System.out.println("                   ----------------\n");

        Scanner input = new Scanner(System.in);

       int id;
        
        do{
        System.out.print("    Enter the Student ID: ");
        
        while (!input.hasNextInt()) {
            title();
            System.out.println("                Invalid input, Try Again!");
            editStudent();
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
              
              
              int choice;
              
              do{
                System.out.print("\n   Which field you want to edit: ");
        
              while (!input.hasNextInt()) {
                System.out.print("   Enter a valid number: ");
                input.next();
                }
                choice = input.nextInt();
              }while(false);
              
              String updateSql = "Update Students set "+ fieldNames[choice-1] + " = ? where Student_id = ?;";
              PreparedStatement ps2 = con.prepareStatement(updateSql);
              System.out.print("   Enter the " + fieldNames[choice-1] + " : ");
              if (choice == 4 || choice == 5) {
                int data = input.nextInt(); 
                ps2.setInt(1, data);
                ps2.setInt(2, id);
              } else {
                String data = input.nextLine();
                 data = input.nextLine();
                ps2.setString(1, data);
                ps2.setInt(2, id);
              }
              ps2.executeUpdate();
              
              System.out.print("\n Successfully Updated!!!\n Press any letter to go to dashboard ");
                 String selection= input.nextLine();
                 if(selection != null){
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
                    editStudent();
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
