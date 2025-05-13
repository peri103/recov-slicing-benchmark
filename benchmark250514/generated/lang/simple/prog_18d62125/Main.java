import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // Add seconds to the current date
        /* write */ Date newDate = DateUtils.addSeconds(currentDate, 10);

        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.SECOND);

        System.out.println("Original Date: " + currentDate);
        System.out.println("Date with Seconds Added: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}