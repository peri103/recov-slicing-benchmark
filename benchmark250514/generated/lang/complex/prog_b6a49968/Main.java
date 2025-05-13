import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        /* write */ Date newDate = DateUtils.addWeeks(date, 1);
        
        // Add 3 days to the original date
        Date threeDaysLater = DateUtils.addDays(date, 3);
        
        // Format the date to a readable string
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = formatter.format(threeDaysLater);
        System.out.println("Three days later: " + formattedDate);
        
        // Calculate the difference in days between newDate and threeDaysLater
        long differenceInMillis = newDate.getTime() - threeDaysLater.getTime();
        long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days: " + differenceInDays);
        
        // Perform some unrelated date manipulation
        Date oneMonthLater = DateUtils.addMonths(date, 1);
        String formattedMonthLater = formatter.format(oneMonthLater);
        System.out.println("One month later: " + formattedMonthLater);
        
        // Truncate the newDate to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DATE);
        
        System.out.println("Truncated date: " + formatter.format(truncatedDate));
        
        // Add more unrelated operations
        Date previousYear = DateUtils.addYears(date, -1);
        String formattedPreviousYear = formatter.format(previousYear);
        System.out.println("Previous year: " + formattedPreviousYear);
        
        // Calculate the difference in weeks between previousYear and date
        long differenceInWeeks = (date.getTime() - previousYear.getTime()) / (1000 * 60 * 60 * 24 * 7);
        System.out.println("Difference in weeks: " + differenceInWeeks);
    }
}