import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize the date object
        Date date = new Date();

        // Set the seconds to a specific value
        /* write */ date = DateUtils.setSeconds(date, 30);

        // Introduce a Calendar object for additional complexity
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, 2); // Add 2 hours to the calendar

        // Perform some unrelated date manipulation
        Date futureDate = calendar.getTime();
        System.out.println("Future date: " + futureDate);

        // More unrelated operations
        Date roundedDate = DateUtils.round(futureDate, Calendar.HOUR);
        System.out.println("Rounded date: " + roundedDate);

        // Complex date manipulation
        calendar.setTime(roundedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5); // Add 5 days
        Date extendedDate = calendar.getTime();
        System.out.println("Extended date: " + extendedDate);

        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MINUTE);

        // Print the truncated date
        System.out.println("Truncated date: " + truncatedDate);

        // Additional unrelated operations
        Date truncatedFutureDate = DateUtils.truncate(futureDate, Calendar.HOUR);
        System.out.println("Truncated future date: " + truncatedFutureDate);
    }
}