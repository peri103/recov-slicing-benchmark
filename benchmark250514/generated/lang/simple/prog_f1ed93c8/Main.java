import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize a Calendar object to the current date
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();

        // Use DateUtils to add months to the current date
        /* write */ Date newDate = DateUtils.addMonths(currentDate, 3);

        // Use DateUtils to truncate the date to remove time part
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DAY_OF_MONTH);

        // Print the truncated date
        System.out.println(truncatedDate);
    }
}