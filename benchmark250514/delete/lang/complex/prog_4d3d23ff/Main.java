import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize current date
        Date now = new Date();

        // Use Calendar to manipulate date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        
        // Add some days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        
        // Set seconds to a specific value on the future date
        /* write */ Date modifiedDate = DateUtils.setSeconds(futureDate, 30);
        
        // Perform additional operations with Calendar
        calendar.setTime(modifiedDate);
        calendar.add(Calendar.HOUR, 3);
        Date futureModifiedDate = calendar.getTime();
        
        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(futureModifiedDate, DateUtils.SECOND);
        
        // Print the truncated date
        System.out.println(truncatedDate);
        
        // Additional unrelated operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MONTH, 2);
        Date twoMonthsLater = calendar.getTime();
        
        System.out.println("Two months later: " + twoMonthsLater);
    }
}