import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Use Calendar to manipulate the Date object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Set a specific time for demonstration purposes
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        
        date = calendar.getTime();
        
        // Additional complexity: manipulate another date
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.set(Calendar.YEAR, 2022);
        anotherCalendar.set(Calendar.MONTH, Calendar.JANUARY);
        anotherCalendar.set(Calendar.DAY_OF_MONTH, 1);
        anotherCalendar.set(Calendar.HOUR_OF_DAY, 15);
        anotherCalendar.set(Calendar.MINUTE, 45);
        Date anotherDate = anotherCalendar.getTime();
        
        // List to store manipulated dates
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(anotherDate);
        
        // Perform some operations on dateList
        for (Date d : dateList) {
            System.out.println("Original Date in List: " + d);
        }
        
        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);
        
        // Further manipulate the ceilingDate
        Calendar ceilingCalendar = Calendar.getInstance();
        ceilingCalendar.setTime(ceilingDate);
        ceilingCalendar.add(Calendar.MINUTE, 10);
        Date modifiedCeilingDate = ceilingCalendar.getTime();
        
        dateList.add(modifiedCeilingDate);
        
        // More operations on dateList
        for (Date d : dateList) {
            System.out.println("Modified Date in List: " + d);
        }
        
        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);
        
        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional operation to add complexity
        Calendar finalCalendar = Calendar.getInstance();
        finalCalendar.setTime(truncatedDate);
        finalCalendar.add(Calendar.DAY_OF_MONTH, 5);
        Date finalDate = finalCalendar.getTime();
        System.out.println("Final Date after adding 5 days: " + finalDate);
    }
}