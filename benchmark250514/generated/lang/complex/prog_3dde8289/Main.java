import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Set the date to the first day of the current month
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date startOfMonth = calendar.getTime();
        
        // Add 10 days to the start of the month
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date tenDaysLater = calendar.getTime();
        
        // Use DateUtils to set hours
        /* write */ date = DateUtils.setHours(tenDaysLater, 15);
        
        // Add some unrelated operations
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, 30);
        Date halfHourLater = calendar.getTime();
        
        // Another unrelated DateUtils operation
        Date roundedDate = DateUtils.round(halfHourLater, Calendar.HOUR);
        System.out.println("Rounded Date: " + roundedDate);
        
        // Truncate the date to the nearest semi-month
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.SEMI_MONTH);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Further unrelated operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.DAY_OF_YEAR, 5);
        Date fiveDaysLater = calendar.getTime();
        System.out.println("Five Days Later: " + fiveDaysLater);
        
        // More complex logic
        for (int i = 0; i < 3; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, i);
            System.out.println("Date with " + i + " days added: " + calendar.getTime());
        }
    }
}