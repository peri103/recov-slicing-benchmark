import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Use Calendar to set a specific time for demonstration
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 24, 10, 15, 30); // Year, Month (0-based), Day, Hour, Minute, Second
        date = calendar.getTime();
        
        // Create an ArrayList to store dates
        ArrayList<Date> dateList = new ArrayList<>();
        
        // Add the original date to the list
        dateList.add(date);

        // Perform some operations on the date list
        for (int i = 0; i < 3; i++) {
            calendar.add(Calendar.DATE, i);
            Date newDate = calendar.getTime();
            dateList.add(DateUtils.ceiling(newDate, Calendar.HOUR));
        }
        
        // Print all dates in the list
        for (Date d : dateList) {
            System.out.println("Date in List: " + d);
        }
        
        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);

        // Perform more operations between write and read
        calendar.add(Calendar.HOUR, 5);
        Date anotherDate = calendar.getTime();
        Date truncatedAnotherDate = DateUtils.truncate(anotherDate, Calendar.MINUTE);
        System.out.println("Another Truncated Date: " + truncatedAnotherDate);
        
        // Add ceilingDate to the list
        dateList.add(ceilingDate);

        // Use a loop to print all dates again
        for (Date d : dateList) {
            System.out.println("Updated Date in List: " + d);
        }
        
        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);
        
        System.out.println("Original Date: " + date);
        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}