import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object with the current date and time
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Format the date for display
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Original Date: " + sdf.format(date));

        // Ceiling the date to the nearest hour
        /* write */ Date ceilingDate = DateUtils.ceiling(calendar, Calendar.HOUR).getTime();
        System.out.println("Ceiling Date: " + sdf.format(ceilingDate));

        // Perform some unrelated complex calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // Create a new calendar instance and add some time
        Calendar newCalendar = Calendar.getInstance();
        newCalendar.setTime(ceilingDate);
        newCalendar.add(Calendar.DAY_OF_MONTH, 5);
        Date newDate = newCalendar.getTime();
        System.out.println("Date after adding 5 days: " + sdf.format(newDate));

        // Truncate the date to the nearest hour
        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);
        System.out.println("Truncated Date: " + sdf.format(truncatedDate));

        // More unrelated code to increase complexity
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Another date manipulation
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.setTime(truncatedDate);
        anotherCalendar.add(Calendar.MINUTE, 30);
        Date halfHourLater = anotherCalendar.getTime();
        System.out.println("Date 30 minutes later: " + sdf.format(halfHourLater));
    }
}