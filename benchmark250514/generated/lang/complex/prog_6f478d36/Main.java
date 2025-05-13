import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        
        // Calculate a future date using DateUtils
        /* write */ Date futureDate = DateUtils.addDays(currentDate, 5);
        
        // Perform some unrelated operations
        calendar.add(Calendar.MONTH, 1);
        Date oneMonthAhead = calendar.getTime();
        System.out.println("One month ahead: " + oneMonthAhead);
        
        // More unrelated operations
        calendar.add(Calendar.YEAR, 1);
        Date oneYearAhead = calendar.getTime();
        System.out.println("One year ahead: " + oneYearAhead);
        
        // Use DateUtils to truncate the future date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, Calendar.DAY_OF_MONTH);
        
        // Print the truncated date
        System.out.println("Truncated future date: " + truncatedDate);
        
        // Additional complex operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date tenDaysAfterTruncated = calendar.getTime();
        System.out.println("Ten days after truncated date: " + tenDaysAfterTruncated);
        
        // Another DateUtils operation for demonstration
        Date roundedDate = DateUtils.round(oneMonthAhead, Calendar.HOUR);
        System.out.println("Rounded month ahead date: " + roundedDate);
    }
}