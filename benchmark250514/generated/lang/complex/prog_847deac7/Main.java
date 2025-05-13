import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        // Set the week of the year to 2
        /* write */ calendar.set(Calendar.WEEK_OF_YEAR, 2);

        // Additional operations
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.setTime(new Date());
        anotherCalendar.set(Calendar.MONTH, 5); // Set month to June
        anotherCalendar.add(Calendar.DAY_OF_MONTH, 10); // Add 10 days to current date

        Date anotherDate = anotherCalendar.getTime();
        System.out.println("Another Date: " + anotherDate);

        // Perform some complex calculations with dates
        long timeDifference = anotherDate.getTime() - calendar.getTimeInMillis();
        long daysDifference = timeDifference / (1000 * 60 * 60 * 24);
        System.out.println("Days Difference: " + daysDifference);

        // Truncate the date to the start of the day
        /* read */ Date truncatedDate = DateUtils.truncate(calendar.getTime(), Calendar.DATE);

        System.out.println("Truncated Date: " + truncatedDate);

        // Further operations with truncated date
        Calendar truncatedCalendar = Calendar.getInstance();
        truncatedCalendar.setTime(truncatedDate);
        truncatedCalendar.add(Calendar.DAY_OF_MONTH, 7); // Add one week to truncated date

        Date weekLaterDate = truncatedCalendar.getTime();
        System.out.println("Week Later Date: " + weekLaterDate);
    }
}