/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;
import java.util.Scanner;
import static sms.Add_New_Student.saveStudent;
import static sms.Delete_Student_Info.removeStudent;
import static sms.Edit_Student_Info.editStudent;
import static sms.Search_Student_By_Id.searchStudent;
import static sms.View_All_Students.viewAllStudents;

public class Dashboard {
    
    public static void title(){
        System.out.println("\n -------------------------------------------------------");
        System.out.println(" | Welcome to Developer Stack Student Managment System |");  
        System.out.println(" -------------------------------------------------------\n");
    }
        
    public static void dashboard() throws Exception{
        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in);    
        System.out.println("    1 -> view all Students");
        System.out.println("    2 -> Search Student");
        System.out.println("    3 -> Save new Student");
        System.out.println("    4 -> Edit Student");
        System.out.println("    5 -> Remove Student");
        System.out.println("    6 -> Close \n");

        System.out.print("    Enter Your Choice : ");
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                System.out.print("\033[H\033[2J");
                title();
                viewAllStudents();
                break;
            case "2":
                System.out.print("\033[H\033[2J");
                title();
                searchStudent();
                break;
            case "3":
                System.out.print("\033[H\033[2J");
                title();
                saveStudent();
                break;    
            case "4":
                System.out.print("\033[H\033[2J");
                title();
                editStudent();
                break;    
       
            case "5":
                System.out.print("\033[H\033[2J");
                title();
                removeStudent();
                break;    
       
            case "6":
                System.exit(0);
                break;  

            default:
                System.out.print("\033[H\033[2J");  
                title();
                System.out.println("    Invalid Choice Try Again!\n");
                dashboard();
                break;
        }
    }
}
