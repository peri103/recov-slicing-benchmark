import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Ceiling the date to the next hour
        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);

        // Simulate some unrelated operations
        List<Date> dateList = new ArrayList<>();
        dateList.add(ceilingDate);
        
        for (int i = 0; i < 5; i++) {
            Date newDate = DateUtils.addMinutes(date, i * 15);
            dateList.add(DateUtils.ceiling(newDate, Calendar.MINUTE));
        }
        
        Date firstDate = dateList.get(0);
        Date secondDate = dateList.get(1);
        
        System.out.println("First Date: " + firstDate);
        System.out.println("Second Date: " + secondDate);
        
        // Perform some calculations
        long timeDifference = secondDate.getTime() - firstDate.getTime();
        System.out.println("Time Difference: " + timeDifference + " milliseconds");

        // Truncate the ceiling date to the hour
        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);
        
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional operations with dateList
        for (Date d : dateList) {
            Date truncated = DateUtils.truncate(d, Calendar.MINUTE);
            System.out.println("Truncated Minute Date: " + truncated);
        }
        
        // Final output
        System.out.println("Final Truncated Date: " + truncatedDate);
    }
}