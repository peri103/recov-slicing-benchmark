import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Create a new Date object
        Date date = new Date();

        // Use Calendar to manipulate Date object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Set the year using DateUtils.setYears
        /* write */ calendar.set(Calendar.YEAR, 2023);

        // Truncate the date to the nearest day using DateUtils.truncate
        /* read */ Date truncatedDate = DateUtils.truncate(calendar.getTime(), Calendar.DATE);

        // Output the truncated date
        System.out.println(truncatedDate);
    }
}