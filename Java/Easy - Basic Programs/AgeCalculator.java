/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 28 feb 2024
* Description : Age Calculator 
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        LocalDate birthdate = null;
        while (birthdate == null) {
            System.out.println("Please enter your birthdate (YYYY-MM-DD):");
            String birthdateString = scanner.nextLine();
            try {
                
                birthdate = LocalDate.parse(birthdateString);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format.");
            }
        }

        
        LocalDate currentDate = LocalDate.now();

        
        Period period = Period.between(birthdate, currentDate);

       
        System.out.print("Your age is : "+period.getYears()+" Years "+ period.getMonths()+" Months " +period.getDays()+" Days");
        
        scanner.close();
    }
}
