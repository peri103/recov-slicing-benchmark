import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a calendar to a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JANUARY, 15); // Setting date to January 15, 2023
        Date date = calendar.getTime();
        
        // Use the setMonths method to change the month
        /* write */ date = DateUtils.setMonths(date, Calendar.MARCH); // Change month to March
        
        // Use the truncate method to truncate the date to the start of the month
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MONTH);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}