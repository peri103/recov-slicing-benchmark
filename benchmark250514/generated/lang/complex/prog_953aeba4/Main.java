import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Create a Calendar instance and set a specific time
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 25, 14, 35, 45); // Example date: October 25, 2023, 14:35:45

        // Get the Date object from the Calendar
        Date originalDate = calendar.getTime();

        // Round the date to the nearest hour using DateUtils
        /* write */ Date roundedDate = DateUtils.round(originalDate, Calendar.HOUR);

        // Add some unrelated logic: Calculate the difference in days between two dates
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.set(2023, Calendar.DECEMBER, 31); // Example date: December 31, 2023
        Date endDate = anotherCalendar.getTime();
        long diffInMillis = endDate.getTime() - originalDate.getTime();
        long diffInDays = diffInMillis / (24 * 60 * 60 * 1000);
        System.out.println("Days until end of year: " + diffInDays);

        // Use DateUtils to add 5 days to the original date
        Date datePlusFiveDays = DateUtils.addDays(originalDate, 5);
        System.out.println("Date plus five days: " + DateFormatUtils.format(datePlusFiveDays, "yyyy-MM-dd"));

        // Perform some complex date manipulation
        Date dateMinusThreeHours = DateUtils.addHours(originalDate, -3);
        Date truncatedDateMinusThreeHours = DateUtils.truncate(dateMinusThreeHours, Calendar.HOUR);
        System.out.println("Truncated date minus three hours: " + truncatedDateMinusThreeHours);

        // Truncate the date to the beginning of the hour using DateUtils
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);

        // Print the results
        System.out.println("Original Date: " + originalDate);
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}