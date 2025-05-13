import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 years to the current date
        /* write */ Date futureDate = DateUtils.addYears(currentDate, 5);
        
        // Unrelated complex logic to manipulate dates
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, 3); // Add 3 months
        Date threeMonthsLater = calendar.getTime();
        
        calendar.setTime(futureDate);
        calendar.add(Calendar.DAY_OF_MONTH, -10); // Subtract 10 days
        Date tenDaysBeforeFuture = calendar.getTime();
        
        // Print the manipulated dates
        System.out.println("Current Date: " + currentDate);
        System.out.println("Three Months Later: " + threeMonthsLater);
        System.out.println("Ten Days Before Future Date: " + tenDaysBeforeFuture);
        
        // Some more complex operations
        Date oneDayBeforeCurrent = DateUtils.addDays(currentDate, -1);
        Date oneDayAfterCurrent = DateUtils.addDays(currentDate, 1);
        
        System.out.println("One Day Before Current Date: " + oneDayBeforeCurrent);
        System.out.println("One Day After Current Date: " + oneDayAfterCurrent);
        
        // Truncate the future date to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, Calendar.DATE);
        
        System.out.println("Future Date: " + futureDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}