import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add 2 months to the current date
        /* write */ Date newDate = DateUtils.addMonths(date, 2);
        
        // Create a calendar instance and set the new date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        
        // Add 10 days to the new date using calendar
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        
        // Format the calendar date to display it
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Date after adding 10 days: " + sdf.format(calendar.getTime()));
        
        // Truncate the new date to remove the time component
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DAY_OF_MONTH);
        
        // Format the truncated date to display it
        System.out.println("Truncated Date: " + sdf.format(truncatedDate));
        
        // Add 1 year to the truncated date
        Date oneYearLater = DateUtils.addYears(truncatedDate, 1);
        
        // Format the date after adding 1 year to display it
        System.out.println("One Year Later: " + sdf.format(oneYearLater));
    }
}