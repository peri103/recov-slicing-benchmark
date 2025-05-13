import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        // Use Calendar to manipulate the date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Set a specific date for demonstration purposes
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 45);

        date = calendar.getTime();

        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);
        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);

        System.out.println("Original Date: " + date);
        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}