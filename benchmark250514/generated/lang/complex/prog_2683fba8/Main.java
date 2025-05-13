import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize current date
        Date currentDate = new Date();
        
        // Add 10 seconds to the current date
        /* write */ Date newDate = DateUtils.addSeconds(currentDate, 10);
        
        // Perform some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 5);
        }
        
        // Print numbers
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        
        // Manipulate calendar object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date nextDay = calendar.getTime();
        
        // Print manipulated dates
        System.out.println("Current Date: " + currentDate);
        System.out.println("New Date after adding 10 seconds: " + newDate);
        System.out.println("Next Day: " + nextDay);
        
        // Truncate the new date to the nearest second
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.SECOND);
        
        // More unrelated operations
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        
        // Print strings
        for (String str : strings) {
            System.out.println("String: " + str);
        }
        
        // Final output
        System.out.println("Truncated Date: " + truncatedDate);
    }
}