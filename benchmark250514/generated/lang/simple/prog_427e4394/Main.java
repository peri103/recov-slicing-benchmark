import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15, 10, 30, 45);
        Date date = calendar.getTime();

        // Round the date to the nearest hour
        /* write */ Date roundedDate = DateUtils.round(date, Calendar.HOUR);

        // Truncate the date to the nearest hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}