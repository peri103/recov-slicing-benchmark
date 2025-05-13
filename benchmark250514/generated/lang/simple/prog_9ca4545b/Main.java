import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add hours to the current date
        /* write */ Date modifiedDate = DateUtils.addHours(date, 5);

        // Truncate the date to remove minutes and seconds
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, java.util.Calendar.HOUR);

        System.out.println("Original Date: " + date);
        System.out.println("Modified Date: " + modifiedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}