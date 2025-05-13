import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // Add seconds to the current date
        /* write */ Date newDate = DateUtils.addSeconds(currentDate, 10);

        // Simulate some complex operations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        calendar.add(Calendar.HOUR, 1);

        Date oneHourLater = calendar.getTime();
        System.out.println("One Hour Later: " + oneHourLater);

        // Perform another operation with DateUtils
        Date roundedDate = DateUtils.round(oneHourLater, Calendar.HOUR);
        System.out.println("Rounded Date: " + roundedDate);

        // Further operations
        calendar.setTime(roundedDate);
        calendar.add(Calendar.DATE, 5);
        Date fiveDaysLater = calendar.getTime();
        System.out.println("Five Days Later: " + fiveDaysLater);

        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.SECOND);

        System.out.println("Original Date: " + currentDate);
        System.out.println("Date with Seconds Added: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // Additional complex operations
        Date truncatedFiveDaysLater = DateUtils.truncate(fiveDaysLater, Calendar.DATE);
        System.out.println("Truncated Five Days Later: " + truncatedFiveDaysLater);

        Date roundedTruncatedDate = DateUtils.round(truncatedDate, Calendar.MINUTE);
        System.out.println("Rounded Truncated Date: " + roundedTruncatedDate);
    }
}