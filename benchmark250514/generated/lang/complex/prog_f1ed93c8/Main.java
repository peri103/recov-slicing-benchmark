import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a Calendar object to the current date
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();

        // Use DateUtils to add months to the current date
        /* write */ Date newDate = DateUtils.addMonths(currentDate, 3);

        // Add some unrelated complex code
        List<Date> dateList = new ArrayList<>();
        dateList.add(currentDate);
        dateList.add(newDate);

        // Calculate the difference in days between currentDate and newDate
        long diffInMillis = newDate.getTime() - currentDate.getTime();
        long daysDiff = diffInMillis / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days: " + daysDiff);

        // Add more dates to the list
        for (int i = 1; i <= 5; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, i);
            dateList.add(calendar.getTime());
        }

        // Print all dates in the list
        for (Date date : dateList) {
            System.out.println("Date in list: " + date);
        }

        // Use DateUtils to truncate the date to remove time part
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DAY_OF_MONTH);

        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
    }
}