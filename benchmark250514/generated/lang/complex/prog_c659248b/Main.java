import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        
        // Round the current date to the nearest day
        /* write */ Date roundedDate = DateUtils.round(now, Calendar.DAY_OF_MONTH);
        
        // Additional code to demonstrate complexity
        List<Date> dateList = new ArrayList<>();
        dateList.add(now);
        
        // Adding more dates to the list
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i <= 5; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, i);
            dateList.add(calendar.getTime());
        }
        
        // Process the list of dates
        for (Date date : dateList) {
            Date truncatedDate = DateUtils.truncate(date, Calendar.DAY_OF_MONTH);
            System.out.println("Truncated Date: " + truncatedDate);
        }
        
        // Calculate the difference between roundedDate and each date in the list
        for (Date date : dateList) {
            long diff = roundedDate.getTime() - date.getTime();
            System.out.println("Difference in milliseconds: " + diff);
        }
        
        // Truncate the rounded date to remove any time components
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.DAY_OF_MONTH);
        
        System.out.println("Final Truncated Date: " + truncatedDate);
    }
}