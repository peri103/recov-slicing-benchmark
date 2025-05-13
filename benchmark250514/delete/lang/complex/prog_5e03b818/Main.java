import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Unrelated code to make the program more complex
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date futureDate = calendar.getTime();
        
        List<Date> dateList = new ArrayList<>();
        dateList.add(futureDate);
        dateList.add(new Date());
        
        // Manipulating dates in the list
        for (Date d : dateList) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            cal.add(Calendar.YEAR, 1);
            System.out.println("Modified Date: " + cal.getTime());
        }

        /* write */ date = DateUtils.setMonths(date, 5);
        
        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.MONTH);
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional unrelated logic
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * i);
        }
        
        for (int num : numbers) {
            System.out.println("Square: " + num);
        }
    }
}