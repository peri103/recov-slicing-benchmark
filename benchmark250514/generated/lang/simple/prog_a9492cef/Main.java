import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize the date object
        Date date = new Date();

        // Set the seconds to a specific value
        /* write */ date = DateUtils.setSeconds(date, 30);

        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(date, java.util.Calendar.MINUTE);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}