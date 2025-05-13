import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object with the current date and time
        Date date = new Date();
        
        // Set the seconds to a specific value using DateUtils.setSeconds
        int seconds = 45;
        /* write */ date = DateUtils.setSeconds(date, seconds);
        
        // Create a calendar instance for additional date manipulation
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Add a random number of days to the date
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        
        // Set the manipulated date back to a Date object
        Date modifiedDate = calendar.getTime();
        
        // Perform some unrelated operations
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based in Calendar
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        
        // Print the modified date details
        System.out.println("Modified Date: " + year + "-" + month + "-" + day);
        
        // Truncate the date to remove the seconds using DateUtils.truncate
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.SECOND);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional unrelated operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.HOUR, 2);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date (2 hours later): " + futureDate);
        
        // Calculate the difference in milliseconds between two dates
        long differenceInMillis = futureDate.getTime() - truncatedDate.getTime();
        System.out.println("Difference in milliseconds: " + differenceInMillis);
    }
}