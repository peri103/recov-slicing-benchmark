import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        
        // Additional code to manipulate dates
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        
        // Some unrelated complex calculations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        
        // More date manipulations
        Date yesterday = DateUtils.addDays(now, -1);
        Date startOfDay = DateUtils.truncate(now, Calendar.DAY_OF_MONTH);
        
        // Original write operation
        /* write */ Date newDate = DateUtils.addSeconds(now, 3600);
        
        // Some more unrelated logic
        double result = Math.sqrt(sum);
        System.out.println("Square root of sum: " + result);
        
        // More date manipulations
        Date endOfDay = DateUtils.addMilliseconds(startOfDay, (24 * 60 * 60 * 1000) - 1);
        
        // Original read operation
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.SECOND);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional date logic
        boolean isAfter = tomorrow.after(now);
        System.out.println("Is tomorrow after now? " + isAfter);
    }
}