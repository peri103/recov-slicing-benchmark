import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the hours of the date to a specific value, for example, 10
        /* write */ date = DateUtils.setHours(date, 10);
        
        // Some unrelated complex operations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date newDate = calendar.getTime();
        
        DateUtils.setMinutes(newDate, 45);
        
        Date truncatedNewDate = DateUtils.truncate(newDate, Calendar.DATE);
        System.out.println("Truncated new date: " + truncatedNewDate);
        
        // More complex operations
        calendar.setTime(truncatedNewDate);
        calendar.add(Calendar.HOUR, 2);
        Date finalDate = calendar.getTime();
        
        DateUtils.setSeconds(finalDate, 30);
        
        Date truncatedFinalDate = DateUtils.truncate(finalDate, Calendar.HOUR);
        System.out.println("Truncated final date: " + truncatedFinalDate);
        
        // Back to the original read operation
        // Truncate the date to remove minutes, seconds, and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.HOUR);
        
        System.out.println("Original truncated date: " + truncatedDate);
        
        // Additional unrelated code
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MINUTE, 15);
        Date additionalDate = calendar.getTime();
        
        DateUtils.setMilliseconds(additionalDate, 500);
        
        Date truncatedAdditionalDate = DateUtils.truncate(additionalDate, Calendar.MINUTE);
        System.out.println("Truncated additional date: " + truncatedAdditionalDate);
    }
}