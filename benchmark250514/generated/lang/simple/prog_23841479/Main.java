import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object with the current date and time
        Date currentDate = new Date();
        
        // Use Calendar to manipulate the date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        
        // Add 5 years to the current date using DateUtils
        /* write */ Date futureDate = DateUtils.addYears(calendar.getTime(), 5);
        
        // Truncate the future date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, Calendar.DATE);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}