/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 23/06/2024
 * Description : User Given Number Postive or Negative
 */

import java.util.Scanner;
public class positive {
   public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number : ");
    int num = sc.nextInt();

    if(num<0){
        System.out.println("The number is Negative");
    }
    else if(num>0){
        System.out.println("The number is Positive");
    }
    else{
        System.out.println("The number is Zero");
    }

    sc.close();

   }

    }
