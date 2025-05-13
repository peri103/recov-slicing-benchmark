import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date modifiedDate;
        
        // Set the month of the current date to February (month index 1)
        /* write */ modifiedDate = DateUtils.setMonths(currentDate, 1);
        
        // Additional code to manipulate dates
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(modifiedDate);
        calendar.add(Calendar.YEAR, 1); // Add one year
        Date oneYearLater = calendar.getTime();
        
        // Perform some operations on the date
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        boolean isLeapYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
        
        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.MILLIS_IN_DAY);
        
        // Print results
        System.out.println("Modified Date: " + modifiedDate);
        System.out.println("One Year Later: " + oneYearLater);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("Is Leap Year: " + isLeapYear);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}