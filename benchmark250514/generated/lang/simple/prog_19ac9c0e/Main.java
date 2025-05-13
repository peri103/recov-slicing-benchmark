import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 5, 10, 30, 45); // Example date: October 5, 2023, 10:30:45
        Date date = calendar.getTime();

        // Use DateUtils to round the date to the nearest hour
        /* write */ Date roundedDate = DateUtils.round(date, Calendar.HOUR);

        // Use DateUtils to truncate the rounded date to the start of the hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}