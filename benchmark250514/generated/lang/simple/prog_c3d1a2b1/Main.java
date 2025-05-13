import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10); // Initialize the date to a specific value
        
        /* write */ calendar.set(Calendar.WEEK_OF_YEAR, 5); // Set the week to a specific value using setWeeks indirectly
        
        Date date = calendar.getTime();
        
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR); // Truncate the date to the start of the week
        
        System.out.println(truncatedDate);
    }
}