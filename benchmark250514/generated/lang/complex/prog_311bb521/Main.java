import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 years to the current date
        /* write */ Date futureDate = DateUtils.addYears(currentDate, 5);
        
        // Create a list to store different dates
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(currentDate);
        
        // Add more dates with different modifications
        Date futureDate2 = DateUtils.addMonths(currentDate, 6);
        dateList.add(futureDate2);
        
        Date futureDate3 = DateUtils.addDays(currentDate, 10);
        dateList.add(futureDate3);
        
        // Perform some operations on the date list
        for (Date date : dateList) {
            System.out.println("Original Date: " + date);
            Date truncated = DateUtils.truncate(date, Calendar.DATE);
            System.out.println("Truncated Date: " + truncated);
        }
        
        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, Calendar.DATE);
        
        System.out.println("Truncated Future Date: " + truncatedDate);
        
        // Additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
    }
}