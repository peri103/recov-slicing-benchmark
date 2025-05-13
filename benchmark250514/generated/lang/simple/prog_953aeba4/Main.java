import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Create a Calendar instance and set a specific time
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 25, 14, 35, 45); // Example date: October 25, 2023, 14:35:45

        // Get the Date object from the Calendar
        Date originalDate = calendar.getTime();

        // Round the date to the nearest hour using DateUtils
        /* write */ Date roundedDate = DateUtils.round(originalDate, Calendar.HOUR);

        // Truncate the date to the beginning of the hour using DateUtils
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);

        // Print the results
        System.out.println("Original Date: " + originalDate);
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}