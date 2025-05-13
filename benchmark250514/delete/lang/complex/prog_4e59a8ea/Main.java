import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        
        // Add years to the current date
        /* write */ Date futureDate = DateUtils.addYears(currentDate, 5);
        
        // Perform some unrelated operations using Calendar
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, 3);
        Date threeMonthsLater = calendar.getTime();
        System.out.println("Three months later: " + threeMonthsLater);
        
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        Date tenDaysAfterThreeMonths = calendar.getTime();
        System.out.println("Ten days after three months: " + tenDaysAfterThreeMonths);
        
        // Use another DateUtils method to round the date
        Date roundedDate = DateUtils.round(futureDate, Calendar.MONTH);
        System.out.println("Rounded date to the nearest month: " + roundedDate);
        
        // Truncate the future date to remove the time part
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, DateUtils.MILLIS_PER_DAY);
        
        // Print the truncated date
        System.out.println("Truncated future date: " + truncatedDate);
        
        // Perform additional operations with the truncated date
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.YEAR, 2);
        Date twoYearsAfterTruncated = calendar.getTime();
        System.out.println("Two years after truncated date: " + twoYearsAfterTruncated);
        
        // Use DateUtils to add days to the truncated date
        Date tenDaysAfterTruncated = DateUtils.addDays(truncatedDate, 10);
        System.out.println("Ten days after truncated date: " + tenDaysAfterTruncated);
    }
}