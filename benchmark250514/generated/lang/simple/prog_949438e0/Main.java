import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 2 weeks to the current date
        /* write */ Date newDate = DateUtils.addWeeks(currentDate, 2);
        
        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.DATE);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("Date after adding 2 weeks: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}