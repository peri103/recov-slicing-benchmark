import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 days to the current date
        /* write */ Date newDate = DateUtils.addDays(currentDate, 5);
        
        // Truncate the new date to remove time elements
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.DATE);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("New Date: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}