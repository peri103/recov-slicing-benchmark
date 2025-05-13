import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        // Add 2 months to the current date
        /* write */ Date newDate = DateUtils.addMonths(currentDate, 2);

        // Perform some unrelated operations
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date dateAfterTenDays = calendar.getTime();
        System.out.println("Date after 10 days: " + dateAfterTenDays);

        calendar.add(Calendar.YEAR, 1);
        Date dateNextYear = calendar.getTime();
        System.out.println("Date next year: " + dateNextYear);

        // Truncate the new date to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.SEMI_MONTH);

        // Perform more operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.HOUR, 5);
        Date dateWithFiveHoursAdded = calendar.getTime();
        System.out.println("Truncated Date with 5 hours added: " + dateWithFiveHoursAdded);

        calendar.add(Calendar.MINUTE, 30);
        Date dateWithThirtyMinutesAdded = calendar.getTime();
        System.out.println("Truncated Date with 30 minutes added: " + dateWithThirtyMinutesAdded);

        // Print the results
        System.out.println("Original Date: " + currentDate);
        System.out.println("Date after adding 2 months: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}