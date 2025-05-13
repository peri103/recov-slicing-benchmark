import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Initialize the year to a specific value
        int year = 2023;
        
        /* write */ 
        date = DateUtils.setYears(date, year);

        // Create a calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Perform some unrelated operations
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        
        // Extract the new date from the calendar
        Date newDate = calendar.getTime();
        
        // Print the new date after modifications
        System.out.println("Modified Date: " + newDate);
        
        // Initialize another date for truncation
        Date anotherDate = new Date();
        
        // Simulate some operations with anotherDate
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.setTime(anotherDate);
        anotherCalendar.add(Calendar.HOUR, 5);
        anotherCalendar.add(Calendar.MINUTE, 30);
        
        Date modifiedAnotherDate = anotherCalendar.getTime();
        System.out.println("Another Modified Date: " + modifiedAnotherDate);

        // Perform some unrelated arithmetic operations
        int someNumber = 10;
        int anotherNumber = 20;
        int result = someNumber * anotherNumber;
        System.out.println("Arithmetic Result: " + result);

        /* read */ 
        Date truncatedDate = DateUtils.truncate(date, DateUtils.MILLIS_PER_DAY);

        System.out.println("Truncated Date: " + truncatedDate);
        
        // Perform more unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}