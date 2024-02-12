import java.util.Scanner; 

/*
 * Author : ShawnArunjith
 * Email  : sh@......
 * Date   : 
 * 
 * Problem : Adding Two numbers
 * Input : 2 , 5
 * Expected Output : 7
 */

class AddTwo {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Type a number:");
    x = myObj.nextInt();

    System.out.println("Type another number:");
    y = myObj.nextInt(); 

    sum = x + y;
    System.out.println("Sum is: " + sum);
  }
} 