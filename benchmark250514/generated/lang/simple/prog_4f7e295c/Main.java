import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();
        
        // Round the date to the nearest hour
        /* write */ Date roundedDate = DateUtils.round(date, Calendar.HOUR);
        
        // Truncate the rounded date to the hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}