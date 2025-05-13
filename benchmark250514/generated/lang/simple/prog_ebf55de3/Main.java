import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add seconds to the current date
        /* write */ Date newDate = DateUtils.addSeconds(date, 30);
        
        // Truncate the date to remove seconds
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.SEMI_MONTH);
        
        System.out.println("Original Date: " + date);
        System.out.println("New Date after adding seconds: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}