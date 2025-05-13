import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Adding 2 weeks to the current date
        /* write */ Date newDate = DateUtils.addWeeks(currentDate, 2);

        // Additional date manipulation: Add 3 days and 5 hours
        Date modifiedDate = DateUtils.addDays(newDate, 3);
        modifiedDate = DateUtils.addHours(modifiedDate, 5);
        
        // Display the intermediate modified date
        System.out.println("Modified Date (after adding 3 days and 5 hours): " + modifiedDate);
        
        // Calculate the difference in days between currentDate and modifiedDate
        long diffInMillis = modifiedDate.getTime() - currentDate.getTime();
        long diffInDays = diffInMillis / (24 * 60 * 60 * 1000);
        System.out.println("Difference in days: " + diffInDays);
        
        // Truncating the new date to remove time part
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DATE);
        
        System.out.println("Truncated Date: " + truncatedDate);

        // Additional manipulation: Add 10 minutes and truncate to nearest hour
        Date anotherModifiedDate = DateUtils.addMinutes(modifiedDate, 10);
        Date truncatedToHour = DateUtils.truncate(anotherModifiedDate, Calendar.HOUR);
        
        // Display the final truncated date
        System.out.println("Truncated to Hour: " + truncatedToHour);
    }
}