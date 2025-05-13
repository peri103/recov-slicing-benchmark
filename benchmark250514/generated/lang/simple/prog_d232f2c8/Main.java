import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JANUARY, 15); // Set to January 15, 2023
        Date date = calendar.getTime();
        
        // Use DateUtils to set the month to February (1)
        /* write */ date = DateUtils.setMonths(date, Calendar.FEBRUARY);
        
        // Use DateUtils to truncate the date to the start of the month
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MONTH);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}