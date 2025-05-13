import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 hours to the current date
        /* write */ Date updatedDate = DateUtils.addHours(currentDate, 5);
        
        // Truncate the updated date to remove minutes and seconds
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.HOUR_OF_DAY);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("Updated Date: " + updatedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}