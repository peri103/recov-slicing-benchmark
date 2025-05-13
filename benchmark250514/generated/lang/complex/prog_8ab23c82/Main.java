import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a Calendar instance with a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15); // Initial date: October 15, 2023
        Date date = calendar.getTime();

        // Use the setDays method to change the day of the month
        /* write */ Date modifiedDate = DateUtils.setDays(date, 10);

        // Create a list to store multiple dates
        List<Date> dateList = new ArrayList<>();
        dateList.add(modifiedDate);
        
        // Add more dates to the list
        calendar.set(2023, Calendar.NOVEMBER, 5);
        dateList.add(calendar.getTime());
        
        calendar.set(2024, Calendar.JANUARY, 1);
        dateList.add(calendar.getTime());

        // Process each date in the list
        for (Date d : dateList) {
            Date truncated = DateUtils.truncate(d, Calendar.MONTH);
            System.out.println("Truncated to month: " + truncated);
        }

        // Use the truncate method to truncate the date to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, Calendar.DATE);

        System.out.println("Original truncated date: " + truncatedDate);

        // Additional operations on the list of dates
        for (Date d : dateList) {
            Date result = DateUtils.addDays(d, 5);
            System.out.println("Date after adding 5 days: " + result);
        }
        
        // Calculate the difference in days between two dates
        Date firstDate = dateList.get(0);
        Date secondDate = dateList.get(1);
        long diffInMillis = secondDate.getTime() - firstDate.getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days between first and second date: " + diffInDays);
    }
}