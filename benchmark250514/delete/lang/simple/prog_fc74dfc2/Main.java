import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the seconds to a specific value using DateUtils.setSeconds
        int seconds = 45;
        /* write */ date = DateUtils.setSeconds(date, seconds);
        
        // Truncate the date to remove the seconds using DateUtils.truncate
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.SECOND);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}