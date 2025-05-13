import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Create a Calendar instance to manipulate the date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Set a specific time for testing
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 45);
        calendar.set(Calendar.SECOND, 30);
        
        Date testDate = calendar.getTime();
        
        /* write */ Date roundedDate = DateUtils.round(testDate, Calendar.HOUR);
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);
        
        System.out.println("Original Date: " + testDate);
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}