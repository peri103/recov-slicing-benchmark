import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Create a Calendar instance and set a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 1); // October 1, 2023
        Date date = calendar.getTime();

        // Use DateUtils to set the day of the month
        /* write */ date = DateUtils.setDays(date, 15);

        // Use DateUtils to truncate the date to the start of the day
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DAY_OF_MONTH);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}