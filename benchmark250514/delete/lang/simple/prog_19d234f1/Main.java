import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the minutes of the date to a specific value
        /* write */ date = DateUtils.setMinutes(date, 30);
        
        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.MILLIS_PER_SECOND);
        
        System.out.println(truncatedDate);
    }
}