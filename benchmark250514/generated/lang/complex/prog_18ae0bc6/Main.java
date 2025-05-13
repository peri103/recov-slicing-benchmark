import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add weeks to the current date
        /* write */ date = DateUtils.addWeeks(date, 2);
        
        // Unrelated code to make the program more complex
        List<Date> dateList = new ArrayList<>();
        dateList.add(date);
        dateList.add(new Date());
        
        for (Date d : dateList) {
            System.out.println("Date in list: " + d);
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date newDate = calendar.getTime();
        
        System.out.println("New Date after adding 5 days: " + newDate);
        
        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DATE);
        
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional unrelated operations
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        
        for (String str : list) {
            System.out.println(str);
        }
    }
}