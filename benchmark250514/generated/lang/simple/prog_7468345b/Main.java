import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        // Use the ceiling method to round up the date to the next hour
        /* write */ Date roundedUpDate = DateUtils.ceiling(calendar, Calendar.HOUR).getTime();

        // Use the truncate method to round down the date to the start of the hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedUpDate, Calendar.HOUR);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}