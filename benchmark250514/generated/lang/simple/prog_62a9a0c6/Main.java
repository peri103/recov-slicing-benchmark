import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();

        // Create a Calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Round the date to the nearest hour
        /* write */ Date roundedDate = DateUtils.round(calendar.getTime(), Calendar.HOUR);

        // Truncate the rounded date to the nearest hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}