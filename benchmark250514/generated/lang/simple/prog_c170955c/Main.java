import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 2 months to the current date
        /* write */ Date newDate = DateUtils.addMonths(currentDate, 2);
        
        // Truncate the new date to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.SEMI_MONTH);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("Date after adding 2 months: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}