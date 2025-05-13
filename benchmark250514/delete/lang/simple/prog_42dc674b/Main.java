import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set minutes to a specific value using DateUtils
        int minutes = 30;
        /* write */ date = DateUtils.setMinutes(date, minutes);
        
        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.MILLIS_IN_MINUTE);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}