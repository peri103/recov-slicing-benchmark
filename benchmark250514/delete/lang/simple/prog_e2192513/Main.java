import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();

        // Set seconds to 0 using DateUtils.setSeconds
        /* write */ date = DateUtils.setSeconds(date, 0);

        // Truncate the date to remove milliseconds using DateUtils.truncate
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.SECOND);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}