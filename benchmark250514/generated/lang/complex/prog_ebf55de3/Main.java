import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add seconds to the current date
        /* write */ Date newDate = DateUtils.addSeconds(date, 30);
        
        // Create a Calendar instance and manipulate it
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        
        // Perform some unrelated operations
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        
        // Calculate the difference between two dates
        Date futureDate = calendar.getTime();
        long differenceInMillis = futureDate.getTime() - date.getTime();
        long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);
        
        System.out.println("Difference in days: " + differenceInDays);

        // Truncate the date to remove seconds
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.SEMI_MONTH);
        
        System.out.println("Original Date: " + date);
        System.out.println("New Date after adding seconds: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Further manipulate the truncated date
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MONTH, 1);
        
        Date finalDate = calendar.getTime();
        System.out.println("Final Date after manipulation: " + finalDate);
    }
}