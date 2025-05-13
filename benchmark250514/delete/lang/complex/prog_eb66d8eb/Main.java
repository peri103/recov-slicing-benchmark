import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Initialize a calendar object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Add 3 days to the current date using Calendar
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date: " + futureDate);

        // Adding hours to the original date
        /* write */ Date updatedDate = DateUtils.addHours(date, 5);

        // Perform some unrelated operations
        calendar.setTime(updatedDate);
        calendar.add(Calendar.MINUTE, 30); // Add 30 minutes
        Date halfHourLater = calendar.getTime();
        System.out.println("Half Hour Later: " + halfHourLater);

        // Truncate the updated date to hour
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.HOUR_OF_DAY);
        System.out.println("Truncated Date: " + truncatedDate);

        // Add 10 days to the truncated date
        Date tenDaysLater = DateUtils.addDays(truncatedDate, 10);
        System.out.println("Ten Days Later: " + tenDaysLater);

        // Another operation using Calendar
        calendar.setTime(tenDaysLater);
        calendar.add(Calendar.MONTH, 1); // Add 1 month
        Date oneMonthLater = calendar.getTime();
        System.out.println("One Month Later: " + oneMonthLater);
    }
}