import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize a Calendar instance and set a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10);
        Date date = calendar.getTime();

        // Use DateUtils to set the year of the date to 2025
        /* write */ Date modifiedDate = DateUtils.setYears(date, 2025);

        // Truncate the date to the start of the day
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, Calendar.DAY_OF_MONTH);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}