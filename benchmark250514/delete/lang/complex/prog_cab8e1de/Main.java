import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Initialize a Calendar instance for additional operations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Manipulate the calendar instance
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        
        // Use DateUtils to set specific hour on the date
        /* write */ Date updatedDate = DateUtils.setHours(date, 10);
        
        // Perform some unrelated operations to make the program more complex
        calendar.setTime(updatedDate);
        calendar.add(Calendar.MONTH, 1);
        Date nextMonthDate = calendar.getTime();
        
        // Use DateUtils to truncate the date to the nearest hour
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.HOUR_OF_DAY);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional complex operations
        calendar.setTime(nextMonthDate);
        calendar.add(Calendar.YEAR, 2);
        Date twoYearsLater = calendar.getTime();
        
        Date monthTruncatedDate = DateUtils.truncate(twoYearsLater, DateUtils.MONTH);
        System.out.println("Month Truncated Date: " + monthTruncatedDate);
        
        // Further date manipulation and printing
        calendar.setTime(monthTruncatedDate);
        calendar.add(Calendar.WEEK_OF_YEAR, 3);
        Date threeWeeksLater = calendar.getTime();
        
        System.out.println("Three Weeks Later Date: " + threeWeeksLater);
    }
}