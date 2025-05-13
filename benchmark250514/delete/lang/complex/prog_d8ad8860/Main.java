import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add 5 hours to the current date
        /* write */ Date newDate = DateUtils.addHours(date, 5);
        
        // Perform some unrelated operations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        Date twoDaysLater = calendar.getTime();
        
        System.out.println("Date after adding two days: " + twoDaysLater);
        
        // Calculate difference in hours between two dates
        long diffInMillis = twoDaysLater.getTime() - date.getTime();
        long diffInHours = diffInMillis / (60 * 60 * 1000);
        
        System.out.println("Difference in hours between original date and two days later: " + diffInHours);
        
        // Truncate the date to remove minutes, seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.HOUR_OF_DAY);
        
        System.out.println("Original Date: " + date);
        System.out.println("New Date after adding hours: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional complex operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MONTH, 1);
        Date oneMonthLater = calendar.getTime();
        
        System.out.println("Date after adding one month: " + oneMonthLater);
        
        diffInMillis = oneMonthLater.getTime() - truncatedDate.getTime();
        long diffInDays = diffInMillis / (24 * 60 * 60 * 1000);
        
        System.out.println("Difference in days between truncated date and one month later: " + diffInDays);
    }
}