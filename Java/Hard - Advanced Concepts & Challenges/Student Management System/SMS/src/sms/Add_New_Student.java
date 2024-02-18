/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;
import java.sql.*;
import java.util.Scanner;
import static sms.View_All_Students.viewAllStudents;
import static sms.Dashboard.*;

public class Add_New_Student {
    private static DB_Connection DB_connection = DB_Connection.get_Instance();
        
    public static void saveStudent(){
        System.out.println("                   ----------------");
        System.out.println("                   | Save Student |");  
        System.out.println("                   ----------------\n");

        Scanner input= new Scanner(System.in);
 
        System.out.print("    Enter Student Name: ");
             String name = input.nextLine();
        System.out.print("    Enter Student NIC: ");
            String nic = input.nextLine();
        System.out.print("    Enter Student Age: ");
             int age = input.nextInt();
        System.out.print("    Enter Student Contact Number: ");
             int contactNumber = input.nextInt();
        System.out.print("    Enter Student Gender: ");
            String gender = input.nextLine();
            gender = input.nextLine();
        System.out.print("    Enter Student Department: ");
            String dep = input.nextLine();

        if(name.equals("") || nic.equals("") || age == 0 || contactNumber == 0 || gender.equals("") || dep.equals("")){
            System.out.print("\033[H\033[2J"); 
            title();
            System.out.print("\n    Please fill all of the fields!\n    You missed a field\n\n");
            saveStudent();
        }else{ 
        
        String query = "INSERT INTO Students (Name,NIC,Age,Contact,Gender,Department) VALUES (?,?,?,?,?,?)";
        try(Connection con = DB_connection.dbConnection()){
            
          PreparedStatement ps = con.prepareStatement(query);
          ps.setString(1, name);
          ps.setString(2, nic);
          ps.setInt(3, age);
          ps.setInt(4, contactNumber);
          ps.setString(5, gender);
          ps.setString(6, dep);
          
            int rs = ps.executeUpdate();
  
            if(rs>0){
          
                System.out.print("\n Successfully Saved!!!\n To Check Press \"y\" or press any letter to go to dashboard: ");
                 String selection= input.nextLine();
                 if(selection.equalsIgnoreCase("y")){
                     title();
                     viewAllStudents();
                 }else{
                     title();
                     dashboard();
                 }
            }
            
        }catch(Exception e){
            System.out.println("Error:" + e);
        } 
        }

    }
}
