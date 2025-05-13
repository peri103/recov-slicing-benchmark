import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Date date = new Date();

        // Add years to the date
        /* write */ date = DateUtils.addYears(date, 5);

        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(date, java.util.Calendar.DAY_OF_MONTH);

        // Format and print the truncated date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(truncatedDate));
    }
}