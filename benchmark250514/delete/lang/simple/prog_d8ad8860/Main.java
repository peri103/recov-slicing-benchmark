import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add 5 hours to the current date
        /* write */ Date newDate = DateUtils.addHours(date, 5);
        
        // Truncate the date to remove minutes, seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.HOUR_OF_DAY);
        
        System.out.println("Original Date: " + date);
        System.out.println("New Date after adding hours: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}