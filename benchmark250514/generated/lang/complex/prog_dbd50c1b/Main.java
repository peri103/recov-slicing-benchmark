import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        // Set the minutes of the date to 30
        /* write */ Date modifiedDate = DateUtils.setMinutes(date, 30);

        // Perform some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Use similar API to modify and truncate another date
        Date anotherDate = new Date();
        anotherDate = DateUtils.setHours(anotherDate, 10);
        Date truncatedAnotherDate = DateUtils.truncate(anotherDate, Calendar.HOUR);
        System.out.println("Another Date: " + anotherDate);
        System.out.println("Truncated Another Date: " + truncatedAnotherDate);

        // More unrelated logic
        int product = 1;
        for (int num : numbers) {
            product *= num == 0 ? 1 : num; // Avoid multiplying by zero
        }
        System.out.println("Product of numbers: " + product);

        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, Calendar.MINUTE);

        System.out.println("Modified Date: " + modifiedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}