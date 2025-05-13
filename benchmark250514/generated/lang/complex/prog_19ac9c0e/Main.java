import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 5, 10, 30, 45); // Example date: October 5, 2023, 10:30:45
        Date date = calendar.getTime();

        // Use DateUtils to round the date to the nearest hour
        /* write */ Date roundedDate = DateUtils.round(date, Calendar.HOUR);

        // Create a list to store multiple dates
        List<Date> dateList = new ArrayList<>();
        dateList.add(date);
        dateList.add(roundedDate);
        
        // Perform some operations on the date list
        for (Date d : dateList) {
            System.out.println("Original Date: " + d);
            Date modifiedDate = DateUtils.addMinutes(d, 15); // Add 15 minutes
            System.out.println("Modified Date: " + modifiedDate);
        }
        
        // Use DateUtils to truncate the rounded date to the start of the hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);

        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Further modify the truncated date
        Date furtherModifiedDate = DateUtils.addDays(truncatedDate, 1); // Add one day
        System.out.println("Further Modified Date: " + furtherModifiedDate);
        
        // Create another list and perform operations
        List<Date> anotherDateList = new ArrayList<>();
        anotherDateList.add(furtherModifiedDate);
        
        for (Date d : anotherDateList) {
            Date finalDate = DateUtils.addHours(d, 3); // Add 3 hours
            System.out.println("Final Date: " + finalDate);
        }
    }
}