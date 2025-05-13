import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the current date
        Date currentDate = new Date();
        
        // Create a list to store dates
        ArrayList<Date> dateList = new ArrayList<>();
        
        // Add weeks to the current date
        /* write */ Date newDate = DateUtils.addWeeks(currentDate, 1);
        
        // Add the new date to the list
        dateList.add(newDate);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Add more dates to the list
        dateList.add(DateUtils.addDays(currentDate, 5));
        dateList.add(DateUtils.addMonths(currentDate, 2));
        
        // Print all dates in the list
        System.out.println("Dates in the list:");
        for (Date date : dateList) {
            System.out.println(date);
        }
        
        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DAY_OF_MONTH);
        
        // Print the truncated date
        System.out.println("Truncated date: " + truncatedDate);
        
        // Perform some calculations with the dates
        long timeDifference = dateList.get(1).getTime() - dateList.get(0).getTime();
        System.out.println("Time difference between first and second date: " + timeDifference + " milliseconds");
        
        // Add another date to the list and print it
        Date anotherNewDate = DateUtils.addYears(currentDate, 1);
        dateList.add(anotherNewDate);
        System.out.println("Another new date: " + anotherNewDate);
    }
}