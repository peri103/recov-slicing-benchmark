import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new Date object
        Date date = new Date();

        // Use Calendar to manipulate Date object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Set the year using DateUtils.setYears
        /* write */ calendar.set(Calendar.YEAR, 2023);

        // Create a list to store dates
        List<Date> dateList = new ArrayList<>();

        // Add some dates to the list
        for (int i = 0; i < 5; i++) {
            Calendar tempCalendar = Calendar.getInstance();
            tempCalendar.set(Calendar.YEAR, 2020 + i);
            tempCalendar.set(Calendar.MONTH, Calendar.JANUARY);
            tempCalendar.set(Calendar.DAY_OF_MONTH, 1);
            dateList.add(tempCalendar.getTime());
        }

        // Process each date in the list
        for (Date d : dateList) {
            // Truncate each date to the nearest day
            Date truncated = DateUtils.truncate(d, Calendar.DATE);
            System.out.println("Truncated Date: " + truncated);
        }

        // Truncate the original date to the nearest day using DateUtils.truncate
        /* read */ Date truncatedDate = DateUtils.truncate(calendar.getTime(), Calendar.DATE);

        // Output the truncated date
        System.out.println("Original Truncated Date: " + truncatedDate);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Create a list of integers and perform operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}