import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 45 seconds to the current date
        /* write */ Date newDate = DateUtils.addSeconds(currentDate, 45);
        
        // Truncate the new date to the nearest second
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.SECOND);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("New Date (45 seconds added): " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}