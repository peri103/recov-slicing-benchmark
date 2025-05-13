import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();
        
        // Use Calendar to manipulate the Date object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Write: Set seconds to a specific value using DateUtils
        /* write */ Date modifiedDate = DateUtils.setSeconds(calendar.getTime(), 30);
        
        // Read: Truncate the date to remove the seconds using DateUtils
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, Calendar.SECOND);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}