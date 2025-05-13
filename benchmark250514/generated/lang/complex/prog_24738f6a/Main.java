import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 years to the current date
        /* write */ Date futureDate = DateUtils.addYears(currentDate, 5);
        
        // Introduce complexity by adding months and days to the current date
        Date futureDateWithMonths = DateUtils.addMonths(futureDate, 2);
        Date futureDateWithDays = DateUtils.addDays(futureDateWithMonths, 10);
        
        // Calculate the difference in days between the current date and future date
        long daysBetween = (futureDateWithDays.getTime() - currentDate.getTime()) / (1000 * 60 * 60 * 24);
        System.out.println("Days between current date and future date: " + daysBetween);
        
        // Perform some unrelated operations with Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(futureDateWithDays);
        calendar.add(Calendar.HOUR, 5);
        calendar.add(Calendar.MINUTE, 30);
        
        // Print the calendar time after adding hours and minutes
        System.out.println("Calendar time after adding hours and minutes: " + calendar.getTime());
        
        // Truncate the future date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, java.util.Calendar.DAY_OF_MONTH);
        
        System.out.println("Future Date: " + futureDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}