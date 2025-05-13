import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a date
        Date date = new Date();
        int year = 2025;

        // Create a Calendar instance for more complex date manipulations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 2);

        // Use ArrayList to store multiple dates
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(calendar.getTime());
        
        // Manipulate dates within the list
        for (Date d : dateList) {
            calendar.setTime(d);
            calendar.add(Calendar.DAY_OF_MONTH, 10);
            dateList.set(dateList.indexOf(d), calendar.getTime());
        }
        
        // Add another date to the list
        calendar.add(Calendar.YEAR, 1);
        dateList.add(calendar.getTime());
        
        // Print all dates in the list
        for (Date d : dateList) {
            System.out.println("Date in list: " + d);
        }
        
        // Set the year of the original date
        /* write */ Date updatedDate = DateUtils.setYears(date, year);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // More unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }

        // Truncate the updated date
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.YEAR);

        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
    }
}