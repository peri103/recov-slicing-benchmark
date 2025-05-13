import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Perform some operations on the calendar
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, 1);

        // Set a specific hour to the date
        /* write */ date = DateUtils.setHours(date, 10);

        // Additional operations on the date
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, 45);
        Date newDate = calendar.getTime();

        // More operations
        calendar.add(Calendar.SECOND, 30);
        Date anotherDate = calendar.getTime();

        // Truncate the date to the nearest hour
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.HOUR_OF_DAY);
        System.out.println("Truncated Date: " + truncatedDate);

        // More complex operations
        calendar.setTime(anotherDate);
        calendar.add(Calendar.HOUR, 2);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date: " + futureDate);

        // Final operations
        calendar.setTime(newDate);
        calendar.add(Calendar.DAY_OF_MONTH, -3);
        Date pastDate = calendar.getTime();
        System.out.println("Past Date: " + pastDate);
    }
}