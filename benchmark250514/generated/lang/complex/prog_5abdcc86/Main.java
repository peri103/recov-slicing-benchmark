import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initializing dates
        Date currentDate = new Date();
        Date anotherDate = new Date(currentDate.getTime() + 100000);

        // Adding hours to the current date
        /* write */ Date dateWithAddedHours = DateUtils.addHours(currentDate, 5);

        // Performing some unrelated date operations
        Date dateWithAddedDays = DateUtils.addDays(anotherDate, 2);
        Date truncatedAnotherDate = DateUtils.truncate(anotherDate, Calendar.DAY_OF_MONTH);

        // Calculating the difference in milliseconds
        long difference = dateWithAddedDays.getTime() - truncatedAnotherDate.getTime();

        // Printing the difference
        System.out.println("Difference in milliseconds: " + difference);

        // Truncating the date with added hours
        /* read */ Date truncatedDate = DateUtils.truncate(dateWithAddedHours, Calendar.HOUR);

        // Printing the truncated date
        System.out.println(truncatedDate);

        // More unrelated operations
        Date dateWithAddedMinutes = DateUtils.addMinutes(currentDate, 120);
        System.out.println("Date with added minutes: " + dateWithAddedMinutes);

        Date truncatedToMinute = DateUtils.truncate(dateWithAddedMinutes, Calendar.MINUTE);
        System.out.println("Truncated to minute: " + truncatedToMinute);
    }
}