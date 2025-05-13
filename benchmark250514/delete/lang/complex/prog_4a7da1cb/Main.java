import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        
        // Set some initial values to the calendar
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        // Convert calendar back to date
        Date initialDate = calendar.getTime();
        
        /* write */ Date updatedDate = DateUtils.setHours(initialDate, 10);
        
        // Perform some unrelated date manipulations
        Date datePlusOneDay = DateUtils.addDays(updatedDate, 1);
        Date dateMinusOneHour = DateUtils.addHours(datePlusOneDay, -1);
        
        // Print intermediate results
        System.out.println("Date Plus One Day: " + datePlusOneDay);
        System.out.println("Date Minus One Hour: " + dateMinusOneHour);
        
        // More unrelated operations
        Date datePlusFiveMinutes = DateUtils.addMinutes(dateMinusOneHour, 5);
        Date dateMinusThirtySeconds = DateUtils.addSeconds(datePlusFiveMinutes, -30);
        
        // Print more intermediate results
        System.out.println("Date Plus Five Minutes: " + datePlusFiveMinutes);
        System.out.println("Date Minus Thirty Seconds: " + dateMinusThirtySeconds);
        
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.MILLIS_PER_DAY);
        
        // Final output
        System.out.println("Original Date: " + date);
        System.out.println("Initial Date: " + initialDate);
        System.out.println("Updated Date: " + updatedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}