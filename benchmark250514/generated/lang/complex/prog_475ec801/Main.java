import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Create a Calendar instance to manipulate the date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Set a specific time for testing
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 45);
        calendar.set(Calendar.SECOND, 30);
        
        Date testDate = calendar.getTime();
        
        // Simulate some unrelated complex operations
        List<Date> dateList = new ArrayList<>();
        dateList.add(testDate);
        for (int i = 0; i < 5; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            dateList.add(calendar.getTime());
        }
        
        // Perform some operations on the list
        for (Date d : dateList) {
            System.out.println("Date in list: " + d);
        }
        
        /* write */ Date roundedDate = DateUtils.round(testDate, Calendar.HOUR);
        
        // More unrelated operations
        calendar.setTime(roundedDate);
        calendar.add(Calendar.HOUR, 2);
        Date newDate = calendar.getTime();
        System.out.println("New Date after adding hours: " + newDate);
        
        // Manipulate the list further
        dateList.add(newDate);
        for (Date d : dateList) {
            System.out.println("Modified Date in list: " + d);
        }
        
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);
        
        System.out.println("Original Date: " + testDate);
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Final operations
        for (Date d : dateList) {
            if (d.before(truncatedDate)) {
                System.out.println("Date before truncated date: " + d);
            }
        }
    }
}