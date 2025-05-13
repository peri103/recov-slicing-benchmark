import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 minutes to the current date
        /* write */ Date updatedDate = DateUtils.addMinutes(currentDate, 5);
        
        // Create a calendar instance and set it to the updated date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(updatedDate);
        
        // Add 2 hours to the calendar instance
        calendar.add(Calendar.HOUR, 2);
        Date twoHoursLater = calendar.getTime();
        
        // Print the original and updated dates
        System.out.println("Original Date: " + currentDate);
        System.out.println("Updated Date (after adding 5 minutes): " + updatedDate);
        
        // Perform some unrelated operations
        for (int i = 0; i < 3; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, i);
            Date futureDate = calendar.getTime();
            System.out.println("Future Date " + i + ": " + futureDate);
        }
        
        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.MILLISECOND);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Check if the truncated date is before the two hours later date
        boolean isBefore = truncatedDate.before(twoHoursLater);
        System.out.println("Is Truncated Date before Two Hours Later Date? " + isBefore);
    }
}