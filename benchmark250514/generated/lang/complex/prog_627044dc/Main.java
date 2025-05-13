import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        // Use Calendar to manipulate the date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Set a specific date for demonstration purposes
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 45);

        date = calendar.getTime();

        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);

        // Additional complex code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            map.put("Key" + i, numbers.get(i));
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Another unrelated Date operation
        Date anotherDate = new Date();
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.setTime(anotherDate);
        anotherCalendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = anotherCalendar.getTime();

        System.out.println("Future Date: " + futureDate);

        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);

        System.out.println("Original Date: " + date);
        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // More complex logic
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Final date manipulation
        anotherCalendar.setTime(truncatedDate);
        anotherCalendar.add(Calendar.HOUR, 3);
        Date modifiedDate = anotherCalendar.getTime();
        System.out.println("Modified Date: " + modifiedDate);
    }
}