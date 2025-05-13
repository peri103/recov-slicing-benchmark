import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Add 5 years to the current date
        /* write */ Date newDate = DateUtils.addYears(date, 5);

        // Perform some unrelated operations
        calendar.add(Calendar.MONTH, 2);
        Date futureDate = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(futureDate);
        System.out.println("Future Date after 2 months: " + formattedDate);

        // Calculate the difference in days between the original and future date
        long diffInMillis = futureDate.getTime() - date.getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days: " + diffInDays);

        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DAY_OF_MONTH);

        // Print the original, new, and truncated dates
        System.out.println("Original Date: " + sdf.format(date));
        System.out.println("Date after adding 5 years: " + sdf.format(newDate));
        System.out.println("Truncated Date: " + sdf.format(truncatedDate));

        // Additional unrelated operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date tenDaysLater = calendar.getTime();
        String tenDaysLaterFormatted = sdf.format(tenDaysLater);
        System.out.println("Date 10 days after truncation: " + tenDaysLaterFormatted);
    }
}