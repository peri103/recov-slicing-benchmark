import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        
        // Add 5 hours to the current date
        /* write */ Date newDate = DateUtils.addHours(now, 5);
        
        // Truncate the new date to remove minutes, seconds, and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.HOUR);
        
        System.out.println("Original Date: " + now);
        System.out.println("Date after adding 5 hours: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}