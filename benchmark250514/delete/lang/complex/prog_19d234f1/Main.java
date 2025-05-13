import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the minutes of the date to a specific value
        /* write */ date = DateUtils.setMinutes(date, 30);
        
        // Create a calendar instance and manipulate it
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, 5); // Add 5 hours
        calendar.add(Calendar.DAY_OF_MONTH, 2); // Add 2 days
        
        // Format the date for display
        Date modifiedDate = calendar.getTime();
        System.out.println("Modified Date: " + modifiedDate);
        
        // Perform some unrelated arithmetic operations
        int a = 10;
        int b = 20;
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.MILLIS_PER_SECOND);
        
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Further manipulate the date
        Date futureDate = DateUtils.addDays(truncatedDate, 10);
        System.out.println("Future Date: " + futureDate);
        
        // Perform loop operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}