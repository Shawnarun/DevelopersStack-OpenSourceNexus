/* 
 * Author : Saara Rafeek
 * Email : saararafeek301@gmail.com
 * Date : 18/02/2024
 * Description : Printing Pyramid Star Pattern 
 * 
 */

public class PyramidStarPattern 
 { 
  public static void main(String args[])   
    {    
        int i, j, row = 6;       
        for (i=0; i<row; i++)   
         {  
            for (j=row-i; j>1; j--)   
              {  
                System.out.print(" ");   
              }   
            for (j=0; j<=i; j++ )   
              {        
                System.out.print("* ");   
              }   
                System.out.println();   
         }       
    }   
}  
