import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();
        
        // Round the date to the nearest minute
        /* write */ Date roundedDate = DateUtils.round(date, Calendar.MINUTE);
        
        // Truncate the rounded date to the minute
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.MINUTE);
        
        // Print the results
        System.out.println("Original Date: " + date);
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}