import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Adding days to the current date
        /* write */ Date newDate = DateUtils.addDays(date, 5);
        
        // Creating a list of dates for demonstration
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(newDate);
        dateList.add(DateUtils.addDays(newDate, 2));
        dateList.add(DateUtils.addDays(newDate, -3));
        
        // Manipulating the calendar object
        calendar.add(Calendar.MONTH, 1);
        Date oneMonthLater = calendar.getTime();
        dateList.add(oneMonthLater);
        
        for (Date d : dateList) {
            System.out.println("Date in list: " + d);
        }
        
        // Truncate the original newDate to the nearest semi-month
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.SEMI_MONTH);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Further manipulation of the calendar
        calendar.add(Calendar.YEAR, -1);
        Date oneYearEarlier = calendar.getTime();
        System.out.println("One year earlier: " + oneYearEarlier);
        
        // Adding more complexity with date comparison
        if (oneMonthLater.after(truncatedDate)) {
            System.out.println("One month later is after the truncated date.");
        } else {
            System.out.println("One month later is not after the truncated date.");
        }
    }
}