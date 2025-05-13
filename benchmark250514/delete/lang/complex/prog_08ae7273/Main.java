import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the seconds of the date to a specific value
        /* write */ date = DateUtils.setSeconds(date, 45);
        
        // Create a calendar instance and set a specific date
        Calendar calendar = new GregorianCalendar(2023, Calendar.OCTOBER, 10, 15, 30, 25);
        calendar.add(Calendar.YEAR, 1); // Add one year to the calendar date
        
        // Perform some operations on the calendar
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week: " + dayOfWeek);
        
        // Use DateUtils to round the calendar date to the nearest hour
        Date roundedDate = DateUtils.round(calendar.getTime(), Calendar.HOUR);
        System.out.println("Rounded Date: " + roundedDate);
        
        // Truncate the date to remove the seconds value
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.SECOND);
        
        // Print the truncated date, which should have seconds set to zero
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional operations on the date
        Date modifiedDate = DateUtils.addDays(date, 5); // Add 5 days to the date
        System.out.println("Modified Date: " + modifiedDate);
        
        // Compare two dates
        boolean isSameDay = DateUtils.isSameDay(date, modifiedDate);
        System.out.println("Is the same day: " + isSameDay);
    }
}