import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add months to the current date
        /* write */ Date futureDate = DateUtils.addMonths(currentDate, 3);

        // Some unrelated operations to make the program more complex
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        Date tenDaysLater = calendar.getTime();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Date 10 Days Later: " + tenDaysLater);

        // Additional operations
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        // Truncate the future date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, DateUtils.MILLIS_IN_DAY);

        System.out.println("Future Date: " + futureDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // Further unrelated operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.YEAR, 1);
        Date oneYearLater = calendar.getTime();
        System.out.println("One Year Later: " + oneYearLater);
    }
}