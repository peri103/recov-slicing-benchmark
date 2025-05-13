import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object with the current date
        Date currentDate = new Date();
        
        // Create a calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        
        // Set the weeks of the calendar to a specific value
        /* write */ Date newDate = DateUtils.setWeeks(calendar.getTime(), 10);
        
        // Truncate the date to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DATE);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}