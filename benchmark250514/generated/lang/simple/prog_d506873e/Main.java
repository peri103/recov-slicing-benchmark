import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the hours of the date to a specific value, for example, 10
        /* write */ date = DateUtils.setHours(date, 10);
        
        // Truncate the date to remove minutes, seconds, and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(date, java.util.Calendar.HOUR);
        
        System.out.println(truncatedDate);
    }
}