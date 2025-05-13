import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Date date = new Date();
        
        // Create a calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Set the year to 2023
        /* write */ date = DateUtils.setYears(date, 2023);
        
        // Add 10 days to the current date using Calendar
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date futureDate = calendar.getTime();
        
        // Perform some unrelated operations
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based in Calendar
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        
        // Print the future date
        System.out.println("Future Date: " + futureDate);
        
        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.MILLIS_PER_DAY);
        
        // Print the original date and the truncated date
        System.out.println("Original Date: " + date);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Calculate difference in days between futureDate and truncatedDate
        long diffInMillis = futureDate.getTime() - truncatedDate.getTime();
        long diffInDays = diffInMillis / DateUtils.MILLIS_PER_DAY;
        
        // Print the difference in days
        System.out.println("Difference in Days: " + diffInDays);
        
        // Perform another unrelated operation
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MONTH, 1);
        Date oneMonthLater = calendar.getTime();
        
        // Print one month later date
        System.out.println("One Month Later: " + oneMonthLater);
    }
}