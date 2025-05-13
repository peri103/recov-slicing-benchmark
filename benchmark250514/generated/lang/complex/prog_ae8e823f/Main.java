import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        /* write */ Date newDate = DateUtils.addHours(date, 5);
        
        // Additional operations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        Date newDatePlusDays = calendar.getTime();
        
        System.out.println("Original Date: " + date);
        System.out.println("Date after adding hours: " + newDate);
        System.out.println("Date after adding days: " + newDatePlusDays);

        // More complex operations
        Date truncatedDatePlusDays = DateUtils.truncate(newDatePlusDays, Calendar.DAY_OF_MONTH);
        calendar.setTime(truncatedDatePlusDays);
        calendar.add(Calendar.MINUTE, 30);
        Date newDatePlusDaysAndMinutes = calendar.getTime();
        
        System.out.println("Truncated Date after adding days: " + truncatedDatePlusDays);
        System.out.println("Date after adding minutes: " + newDatePlusDaysAndMinutes);
        
        // Even more operations
        long timeDifference = newDatePlusDaysAndMinutes.getTime() - date.getTime();
        long hoursDifference = timeDifference / (1000 * 60 * 60);
        
        System.out.println("Time difference in hours: " + hoursDifference);
        
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.HOUR);
        
        System.out.println("Truncated Date: " + truncatedDate);
    }
}