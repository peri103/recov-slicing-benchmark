import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Additional code to manipulate dates
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        Date twoDaysLater = calendar.getTime();
        
        System.out.println("Original Date: " + date);
        System.out.println("Date after adding two days: " + twoDaysLater);
        
        /* write */ Date modifiedDate = DateUtils.addHours(date, 5);
        
        // More complex operations
        calendar.setTime(modifiedDate);
        calendar.add(Calendar.MINUTE, 30);
        Date modifiedPlusMinutes = calendar.getTime();
        
        System.out.println("Date after adding 5 hours: " + modifiedDate);
        System.out.println("Date after adding 30 minutes: " + modifiedPlusMinutes);

        // Even more operations with dates
        calendar.setTime(twoDaysLater);
        calendar.add(Calendar.HOUR, 3);
        Date twoDaysLaterPlusHours = calendar.getTime();
        
        System.out.println("Date two days later plus 3 hours: " + twoDaysLaterPlusHours);
        
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.HOUR_OF_DAY);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional unrelated operations
        Date finalDate = DateUtils.addMinutes(truncatedDate, 45);
        System.out.println("Final Date after adding 45 minutes: " + finalDate);
    }
}