import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object with the current date and time
        Date now = new Date();
        
        // Add 10 seconds to the current date
        /* write */ Date futureDate = DateUtils.addSeconds(now, 10);
        
        // Perform some unrelated operations to make the program more complex
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        
        // Add 5 minutes to the current time using Calendar
        calendar.add(Calendar.MINUTE, 5);
        Date fiveMinutesLater = calendar.getTime();
        
        // Print the date 5 minutes later
        System.out.println("Five minutes later: " + fiveMinutesLater);
        
        // Subtract 2 hours from the current time using Calendar
        calendar.add(Calendar.HOUR, -2);
        Date twoHoursEarlier = calendar.getTime();
        
        // Print the date 2 hours earlier
        System.out.println("Two hours earlier: " + twoHoursEarlier);
        
        // Truncate the futureDate to remove seconds
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, DateUtils.SECOND);
        
        // Print the truncatedDate
        System.out.println("Truncated date (seconds removed): " + truncatedDate);
        
        // Perform some more unrelated operations
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(futureDate);
        
        // Add 3 days to the futureDate using Calendar
        calendar2.add(Calendar.DAY_OF_MONTH, 3);
        Date threeDaysLater = calendar2.getTime();
        
        // Print the date 3 days later
        System.out.println("Three days later: " + threeDaysLater);
        
        // Subtract 1 month from the futureDate using Calendar
        calendar2.add(Calendar.MONTH, -1);
        Date oneMonthEarlier = calendar2.getTime();
        
        // Print the date 1 month earlier
        System.out.println("One month earlier: " + oneMonthEarlier);
    }
}