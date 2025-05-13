import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 1); // Initialize with a specific date
        Date date = calendar.getTime();

        // Set the day of the month to 15
        /* write */ date = DateUtils.setDays(date, 15);

        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DATE);

        System.out.println(truncatedDate);
    }
}