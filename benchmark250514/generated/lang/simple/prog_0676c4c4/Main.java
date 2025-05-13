import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Use Calendar to manipulate the Date object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Set a specific time for demonstration purposes
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        
        date = calendar.getTime();
        
        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);
        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);
        
        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}