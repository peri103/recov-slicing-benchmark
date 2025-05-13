import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        // Add 45 seconds to the current date
        /* write */ Date newDate = DateUtils.addSeconds(currentDate, 45);

        // Additional logic to manipulate date and time
        calendar.add(Calendar.DAY_OF_MONTH, 5); // Add 5 days
        Date fiveDaysLater = calendar.getTime();
        System.out.println("Date after adding 5 days: " + fiveDaysLater);

        calendar.add(Calendar.HOUR, 3); // Add 3 hours
        Date threeHoursLater = calendar.getTime();
        System.out.println("Date after adding 3 hours: " + threeHoursLater);

        // Perform operations on the new date
        int hours = threeHoursLater.getHours();
        System.out.println("Hours in modified date: " + hours);

        // Truncate the new date to the nearest second
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.SECOND);

        System.out.println("Original Date: " + currentDate);
        System.out.println("New Date (45 seconds added): " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // Further operations on truncated date
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MINUTE, 10); // Add 10 minutes
        Date tenMinutesLater = calendar.getTime();
        System.out.println("Truncated date after adding 10 minutes: " + tenMinutesLater);
    }
}