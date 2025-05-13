import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize the current date
        Date currentDate = new Date();
        
        // Add weeks to the current date
        /* write */ Date newDate = DateUtils.addWeeks(currentDate, 1);
        
        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DAY_OF_MONTH);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}