import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        int monthsToAdd = 3;

        /* write */ Date newDate = DateUtils.addMonths(date, monthsToAdd);

        // Additional code using Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        Date tenDaysLater = calendar.getTime();

        // Using ArrayList to store dates
        List<Date> dateList = new ArrayList<>();
        dateList.add(newDate);
        dateList.add(tenDaysLater);

        // Iterate over the list and print dates
        for (Date d : dateList) {
            System.out.println("Stored Date: " + d);
        }

        // Perform some arithmetic operations
        int number = 5;
        int result = number * 2 + 10;
        System.out.println("Arithmetic Result: " + result);

        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.MONTH);

        System.out.println("Truncated Date: " + truncatedDate);

        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use DateUtils to add days to the truncated date
        Date futureDate = DateUtils.addDays(truncatedDate, 15);
        System.out.println("Future Date: " + futureDate);
    }
}