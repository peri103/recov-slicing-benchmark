import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();
        
        // Create a Calendar object to manipulate the date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Set the month using DateUtils
        /* write */ date = DateUtils.setMonths(date, 5); // Set month to June (0-based index)
        
        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MONTH);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}