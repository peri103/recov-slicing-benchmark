import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 days to the current date
        /* write */ Date newDate = DateUtils.addDays(currentDate, 5);
        
        // Perform some unrelated date operations
        Calendar cal = Calendar.getInstance();
        cal.setTime(newDate);
        cal.add(Calendar.MONTH, 1); // Add one month
        Date oneMonthLater = cal.getTime();
        
        System.out.println("One Month Later: " + oneMonthLater);
        
        // Further unrelated operations
        Date yesterday = DateUtils.addDays(currentDate, -1);
        System.out.println("Yesterday's Date: " + yesterday);
        
        // More unrelated operations
        Date startOfDay = DateUtils.truncate(currentDate, Calendar.DAY_OF_MONTH);
        System.out.println("Start of Current Day: " + startOfDay);
        
        // Truncate the new date to remove time elements
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DATE);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("New Date: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional unrelated date manipulations
        Date nextWeek = DateUtils.addDays(currentDate, 7);
        System.out.println("Date Next Week: " + nextWeek);
        
        Date endOfDay = DateUtils.addMilliseconds(startOfDay, DateUtils.MILLIS_PER_DAY - 1);
        System.out.println("End of Current Day: " + endOfDay);
    }
}