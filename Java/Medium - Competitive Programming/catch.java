/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 27.02.2024
* Description :  Exception
*/

public class catch{
    public static void main (String s[]){
        int num1 = 0 , num2 = 10 , num3 ;
        try{
            num3 = num1 / num2 ;
            System.out.println("A");
        }
        catch (Exception e) {
            System.out.println("B");
        }
        finally {
            System.out.println("C");       
        }
            System.out.println("D");
    }
}
