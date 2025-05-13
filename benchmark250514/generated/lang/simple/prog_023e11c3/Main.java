import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Use Calendar to set a specific time for demonstration
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 24, 10, 15, 30); // Year, Month (0-based), Day, Hour, Minute, Second
        date = calendar.getTime();
        
        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);
        
        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);
        
        System.out.println("Original Date: " + date);
        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}