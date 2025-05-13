import java.util.Date;
import java.util.Calendar;
import org.apache.commons.lang3.time.DateUtils;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Original Date: " + dateFormat.format(date));

        /* write */ 
        date = DateUtils.setHours(date, 10);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date: " + dateFormat.format(futureDate));

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // More operations using Calendar
        calendar.set(Calendar.YEAR, 2025);
        Date modifiedDate = calendar.getTime();
        System.out.println("Modified Date: " + dateFormat.format(modifiedDate));

        // Complex operations with Date
        calendar.add(Calendar.MONTH, 3);
        Date threeMonthsLater = calendar.getTime();
        System.out.println("Date three months later: " + dateFormat.format(threeMonthsLater));

        /* read */ 
        Date truncatedDate = DateUtils.truncate(date, Calendar.HOUR);
        System.out.println("Truncated Date: " + dateFormat.format(truncatedDate));
        
        // Additional operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MINUTE, 45);
        Date fortyFiveMinutesLater = calendar.getTime();
        System.out.println("Date 45 minutes later: " + dateFormat.format(fortyFiveMinutesLater));
    }
}