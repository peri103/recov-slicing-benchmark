import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 1); // Set to October 1, 2023
        Date date = calendar.getTime();

        // Use DateUtils to set weeks
        /* write */ date = DateUtils.setWeeks(date, 5);

        // Use DateUtils to truncate the date to the start of the week
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR);

        // Print the result
        System.out.println(truncatedDate);
    }
}