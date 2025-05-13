import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        Date futureDate = DateUtils.addDays(now, 5);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(futureDate);
        calendar.add(Calendar.HOUR, 3);
        Date advancedDate = calendar.getTime();
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* write */ Date newTime = DateUtils.addMinutes(now, 10);

        // More unrelated operations
        double product = 1.0;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Use Calendar to manipulate date
        calendar.setTime(newTime);
        calendar.add(Calendar.SECOND, 30);
        Date newTimeWithSeconds = calendar.getTime();

        // Further unrelated computations
        int factorial = 1;
        for (int i = 1; i <= 4; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 4: " + factorial);

        /* read */ Date truncatedTime = DateUtils.truncate(newTimeWithSeconds, Calendar.MINUTE);
        System.out.println(truncatedTime);

        // Additional date manipulation
        Date pastDate = DateUtils.addWeeks(now, -2);
        calendar.setTime(pastDate);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date adjustedPastDate = calendar.getTime();
        System.out.println("Adjusted past date: " + adjustedPastDate);
    }
}