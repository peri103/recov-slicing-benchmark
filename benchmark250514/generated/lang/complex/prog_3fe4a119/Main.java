import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();
        
        // Use Calendar to manipulate the Date object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        // Additional code for complexity: ArrayList manipulation
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }
        
        // Perform some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Write: Set seconds to a specific value using DateUtils
        /* write */ Date modifiedDate = DateUtils.setSeconds(calendar.getTime(), 30);
        
        // More operations on the list
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);
        
        // Read: Truncate the date to remove the seconds using DateUtils
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, Calendar.SECOND);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional operations for complexity: Calculate average
        double average = sum / (double) numbers.size();
        System.out.println("Average of numbers: " + average);
        
        // Check if a specific number exists in the list
        boolean containsTwenty = numbers.contains(20);
        System.out.println("Contains 20: " + containsTwenty);
    }
}