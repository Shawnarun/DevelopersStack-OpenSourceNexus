/* 
 * Author : DirosanJ
 * Email : dirosan06@gmail.com
 * Date : 28th June 2024
 * 
 * Description : System Management System 
 */



import java.util.Arrays;
import java.util.Scanner;

class main{
 static String[][] studentList= new String[100][6];
static String[][] tempList= new String[100][6];
    public static void dashboard(){ 
   
    
        Scanner s = new Scanner (System.in);


        System.out.println(" \" Student Management  System \" \n");
        System.out.println("1 Save new student");
        System.out.println("2 Edit Student");
        System.out.println("3 View all students");
        System.out.println("4 view student ");
        System.out.println("5 Remove student");
        System.out.println("6 Log Out \n");

        System.out.print("Enter Your Choice : ");
        int choice=s.nextInt();
        System.out.println(choice);

        switch (choice) {
           case 1:
            saveStudent();

            break;
           case 2:
           editStudent();
            break;

           case 3:
            viewAllStudents();
            break;

           case 4:
            searchStudent();

            break;

           case 5:
           removeStudent();
          
            break;

            case 6:
            System.exit(0);

            break;

            default:
              System.out.print("\033[H\033[2J");
              System.out.println("Invalid Choice Try Again !!");
              
               dashboard();
              break;
        }
}
public static void saveStudent(){

        System.out.print("\033[H\033[2J");
        System.out.println(" \" Student Management  System \" \n");
        System.out.println("--------------");
         System.out.println(" Save Student ");
          System.out.println("--------------\n");

          Scanner s= new Scanner(System.in);

          
          System.out.print("Enter Student Name ");
             String name = s.nextLine();
          System.out.print("Enter Student NIC ");   
             String nic = s.nextLine();
           System.out.print("Enter Student Age ");
             String age = s.nextLine();
            System.out.print("Enter Student Contact Number ");
             String contactNumber = s.nextLine();
            System.out.print("Enter Student Gender ");
             String gender = s.nextLine();
            System.out.print("Enter Student DOB");
             String dob = s.nextLine();
 
            int index=0;
            for(int i=0; i<studentList.length; i++){
               if(studentList[i][0]==null){
                  index=i;
                  break;
               }
            }
            studentList[index][0]=name;
            studentList[index][1]=nic;
            studentList[index][2]=age;
            studentList[index][3]=contactNumber;
            studentList[index][4]=gender;
            studentList[index][5]=dob;
 
            System.out.println("Sucessfully done \n"+Arrays.toString(studentList[index]));
            System.out.print("\nDo you want to save another student press \"y\" or press any letter \n");
            String selection= s.nextLine();
            if (selection.equalsIgnoreCase("y")){
               saveStudent();
            }         
      else {
         System.out.print("\033[H\033[2J");
         dashboard();
      }

    }

    public static void viewAllStudents() {
       Scanner s= new Scanner(System.in);
      System.out.print("\033[H\033[2J");
      System.out.println(" \" Student Management  System \" \n");
      System.out.println("--------------");
       System.out.println(" View All Student ");
        System.out.println("--------------\n");

      for(int i=0;i<studentList.length;i++){
     
         if(studentList[i][0]==null){
    
            break;
}
         System.out.println(Arrays.toString(studentList [i]));
      
      }
      System.out.print("\n press any letter to go dashboard \n");
      String selection= s.nextLine();
      
      if (selection != null){
         System.out.print("\033[H\033[2J");
         dashboard();
      }         


    }

    
public static void searchStudent() {
   System.out.print("\033[H\033[2J");

   Scanner s=new Scanner (System.in);
   System.out.println(" \" Student Management  System \" \n");
   System.out.println("--------------");
    System.out.println(" Search Student ");
     System.out.println("--------------\n");

     System.out.print(" Enter Student NIC Number");
     String nic=s.nextLine();
     

     for(int i = 0; i< studentList.length;i++){
     

      if(studentList[i][1].equals(nic)){
         System.out.println("\n"+Arrays.toString(studentList[i]));
         break;
      }
     }
     System.out.print("\n press any letter to go dashboard \n");
     String selection= s.nextLine();
     
     if (selection != null){
        System.out.print("\033[H\033[2J");
        dashboard();
     }    
}

public static void removeStudent(){

   System.out.print("\033[H\033[2J");

   Scanner s=new Scanner (System.in);
   System.out.println(" \" Student Management  System \" \n");
   System.out.println("--------------");
    System.out.println(" Remove Student ");
     System.out.println("--------------\n");

     System.out.print(" Enter Student NIC Number");
     String nic=s.nextLine();

     int index=-1;
     

     for(int i = 0; i< studentList.length;i++){
     
      if(studentList[i][1].equals(nic)){
         index=i;
        
         
        
         break;
      }
     
       }
          int x=0;
           for(int k=0;k<studentList.length;k++){
            if(k==index){
               continue;
            }
            tempList[x]=studentList[k];
            x++;
           }    
           
           for(int u=0;u<tempList.length;u++){
            if(tempList[u][0]==null){
               break;
            }
            System.out.println(Arrays.toString(tempList[u]));
           }
           System.out.print("\n press any letter to go dashboard \n");
           String selection= s.nextLine();
           if(selection != null){
            System.out.print("\033[H\033[2J");
            dashboard();
           }
       }
     
public static void editStudent(){
   System.out.print("\033[H\033[2J");
   System.out.println(" \" Student Management  System \" \n");
   System.out.println("--------------");
    System.out.println(" Edit Student ");
     System.out.println("--------------\n");

     Scanner s= new Scanner(System.in);

     System.out.print(" Enter Student NIC Number");
     String nic=s.nextLine();

     int index=-1;
     

     for(int i = 0; i< studentList.length;i++){
     
      if(studentList[i][1].equals(nic)){
         index=i;
         break;
      }
     
       }
System.out.println(Arrays.toString(studentList[index]) + "\n");

System.out.println(" WHICH FIELD TO BE EDIT ");

System.out.println("0 - Name ");
System.out.println("1 - NIC ");
System.out.println("2 - Age ");
System.out.println("3 - Contact Number ");
System.out.println("4 - Gender ");
System.out.println("5 - DOB ");
int choice=s.nextInt();


Scanner scanner= new Scanner(System.in);
switch (choice) {
   case 0:
    System.out.println("Enter name to be edit");
    String name=s.nextLine();
    studentList[index][0]=name;
      break;

      case 1:
      System.out.println("Enter NIC to be edit");
      String nic2=s.nextLine();
      studentList[index][1]=nic2;
      break;

      case 2:
      System.out.println("Enter Age to be edit");
      String age=s.nextLine();
      studentList[index][2]=age;
      break;

      case 3:
      System.out.println("Enter Contact Number to be edit");
      String contactNumber=s.nextLine();
      studentList[index][3]=contactNumber;
      break;

      case 4:
      System.out.println("Enter Gender to be edit");
      String gender=s.nextLine();
      studentList[index][4]=gender;
      break;

      case 5:
      System.out.println("Enter DOB to be edit");
      String dob=s.nextLine();
      studentList[index][5]=dob;
      break;



   default:
   System.out.println("invalid choice");
      break;
}
       System.out.print("\n press any letter to go dashboard \n");
           String selection= s.nextLine();
           if(selection != null){
            System.out.print("\033[H\033[2J");
            dashboard();
           }
}
     

public static void main(String[] args){
 dashboard();

}






 }