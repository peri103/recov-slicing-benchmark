import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize a Date object
        Date now = new Date();
        
        // Step 2: Add 5 hours to the current date
        /* write */ Date newDate = DateUtils.addHours(now, 5);
        
        // Step 3: Perform some unrelated date manipulations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date futureDate = calendar.getTime();
        
        calendar.setTime(newDate);
        calendar.add(Calendar.MINUTE, 30);
        Date newDateWithMinutes = calendar.getTime();

        // Step 4: Truncate the new date to remove minutes, seconds, and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.HOUR);
        
        // Step 5: Output the results of various date manipulations
        System.out.println("Original Date: " + now);
        System.out.println("Date after adding 5 hours: " + newDate);
        System.out.println("Future Date (10 days from now): " + futureDate);
        System.out.println("New Date with additional 30 minutes: " + newDateWithMinutes);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Step 6: Additional unrelated operations
        calendar.setTime(futureDate);
        calendar.add(Calendar.YEAR, 2);
        Date twoYearsLater = calendar.getTime();
        
        System.out.println("Date two years later: " + twoYearsLater);
    }
}