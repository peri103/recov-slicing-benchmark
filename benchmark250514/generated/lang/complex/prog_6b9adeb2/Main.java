import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();
        
        // Create a Calendar object to manipulate the date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Set the month using DateUtils
        /* write */ date = DateUtils.setMonths(date, 5); // Set month to June (0-based index)
        
        // Perform some unrelated date manipulations
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        Date newDate = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.ENGLISH);
        System.out.println("Formatted Date: " + formatter.format(newDate));
        
        // Calculate the difference in days between two dates
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.set(2023, Calendar.JUNE, 20);
        Date anotherDate = anotherCalendar.getTime();
        long diffInMillis = anotherDate.getTime() - newDate.getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days: " + diffInDays);

        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MONTH);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional operations with the truncated date
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date after 10 days: " + formatter.format(futureDate));
        
        // Check if a date is before another date
        boolean isBefore = truncatedDate.before(anotherDate);
        System.out.println("Is truncated date before another date? " + isBefore);
    }
}