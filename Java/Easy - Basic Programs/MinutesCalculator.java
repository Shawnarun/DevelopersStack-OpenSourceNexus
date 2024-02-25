import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MinutesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
       
        LocalDateTime startDate = null;
        while (startDate == null) {
            System.out.print("Enter start date (yyyy-MM-dd HH:mm): ");
            String startDateStr = scanner.nextLine();
            try {
                startDate = LocalDateTime.parse(startDateStr, formatter);
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter the date in the format yyyy-MM-dd HH:mm.");
            }
        }
        
       
        LocalDateTime endDate = null;
        while (endDate == null) {
            System.out.print("Enter end date (yyyy-MM-dd HH:mm): ");
            String endDateStr = scanner.nextLine();
            try {
                endDate = LocalDateTime.parse(endDateStr, formatter);
                if (endDate.isBefore(startDate)) {
                    System.out.println("End date must be after the start date.");
                    endDate = null;
                }
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter the date in the format yyyy-MM-dd HH:mm.");
            }
        }
        
       
        Duration duration = Duration.between(startDate, endDate);
        
        long totalMinutes = duration.toMinutes();
        
        System.out.println("Total minutes between the two dates: " + totalMinutes+"Min");
        
        scanner.close();
    }
}
