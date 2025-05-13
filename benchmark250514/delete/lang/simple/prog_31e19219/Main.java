import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize a calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15); // Set to a specific date

        // Convert calendar to date
        Date date = calendar.getTime();

        // Use DateUtils to set weeks (write operation)
        /* write */ date = DateUtils.setWeeks(date, 3);

        // Use DateUtils to truncate (read operation)
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}