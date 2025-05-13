import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Date date = new Date();

        // Add years to the date
        /* write */ date = DateUtils.addYears(date, 5);

        // Create a list of dates for demonstration
        List<Date> dateList = new ArrayList<>();
        dateList.add(date);
        dateList.add(DateUtils.addYears(date, -3));
        dateList.add(DateUtils.addMonths(date, 2));
        
        // Loop through the list and print each date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Date d : dateList) {
            System.out.println("Original Date: " + dateFormat.format(d));
        }

        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DAY_OF_MONTH);

        // Format and print the truncated date
        System.out.println("Truncated Date: " + dateFormat.format(truncatedDate));

        // Additional logic to manipulate dates
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date newDate = calendar.getTime();
        System.out.println("New Date after adding 10 days: " + dateFormat.format(newDate));

        // Calculate the difference in days between two dates
        long differenceInMillis = newDate.getTime() - truncatedDate.getTime();
        long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days: " + differenceInDays);
    }
}