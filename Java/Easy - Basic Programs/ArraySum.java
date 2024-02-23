/**
Author: AyshaCader
Email: ayshacader20001@gmail.com
Date: 23/02/2024
Description: Get the summation of an array
 */


public class ArraySum {

    public static void main(String[] args) {
        
        //Get the sum of array
        int array_sum[] = {12, 23, 34, 45, 56};
        int len = array_sum.length;
        int sum = 0;
        
        for(int i=0; i<len; i++)
        {
            sum = sum+array_sum[i];
            
        }
        
        System.out.print("sum of array = "+sum+"\n");
}
}
