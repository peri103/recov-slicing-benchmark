import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Round the current date to the nearest semi-month
        /* write */ Date roundedDate = DateUtils.round(currentDate, DateUtils.SEMI_MONTH);
        
        // Perform some unrelated operations to make the program more complex
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 10); // Add 10 days
        Date futureDate = calendar.getTime();
        
        List<Date> dateList = new ArrayList<>();
        dateList.add(futureDate);
        dateList.add(currentDate);
        
        // Print all dates in the list
        for (Date date : dateList) {
            System.out.println("Date in list: " + date);
        }
        
        // Calculate the difference between the future date and current date
        long differenceInMillis = futureDate.getTime() - currentDate.getTime();
        long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days: " + differenceInDays);
        
        // Truncate the rounded date to the start of the semi-month
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, DateUtils.SEMI_MONTH);
        
        // Output the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Add more operations to increase complexity
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MONTH, 1); // Add one month
        Date nextMonthDate = calendar.getTime();
        System.out.println("Next month date: " + nextMonthDate);
    }
}