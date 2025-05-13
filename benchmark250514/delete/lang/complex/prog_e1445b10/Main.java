import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        // Add seconds to the current date
        /* write */ Date modifiedDate = DateUtils.addSeconds(now, 10);

        // Perform some unrelated operations
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();

        System.out.println("Original Date: " + now);
        System.out.println("Future Date: " + futureDate);
        System.out.println("Day of the Week: " + dayOfWeek);

        // Truncate the modified date to the nearest minute
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.MILLIS_IN_MINUTE);

        // More unrelated operations
        calendar.setTime(truncatedDate);
        int truncatedDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("Modified Date: " + modifiedDate);
        System.out.println("Truncated Date: " + truncatedDate);
        System.out.println("Truncated Day of the Week: " + truncatedDayOfWeek);

        // Additional Date manipulation
        Date addedDaysDate = DateUtils.addDays(now, 3);
        Date truncatedToDay = DateUtils.truncate(addedDaysDate, Calendar.DAY_OF_MONTH);

        System.out.println("Added Days Date: " + addedDaysDate);
        System.out.println("Truncated to Day: " + truncatedToDay);
    }
}