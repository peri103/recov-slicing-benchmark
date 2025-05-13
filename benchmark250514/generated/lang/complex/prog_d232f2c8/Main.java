import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JANUARY, 15); // Set to January 15, 2023
        Date date = calendar.getTime();
        
        // Use DateUtils to set the month to February (1)
        /* write */ date = DateUtils.setMonths(date, Calendar.FEBRUARY);
        
        // Additional unrelated code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // More unrelated code
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("World");
        
        for (String greeting : greetings) {
            System.out.println(greeting);
        }
        
        // Use DateUtils to truncate the date to the start of the month
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MONTH);
        
        // Print the truncated date
        System.out.println(truncatedDate);
        
        // Further complexity with list operations
        List<Date> dates = new ArrayList<>();
        dates.add(date);
        dates.add(truncatedDate);
        
        for (Date d : dates) {
            System.out.println("Date in list: " + d);
        }
    }
}