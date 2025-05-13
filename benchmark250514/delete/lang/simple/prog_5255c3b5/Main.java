import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 minutes to the current date
        /* write */ Date updatedDate = DateUtils.addMinutes(currentDate, 5);
        
        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.MILLISECOND);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("Updated Date: " + updatedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}