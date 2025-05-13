import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add 5 years to the current date
        /* write */ Date newDate = DateUtils.addYears(date, 5);
        
        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.DAY_OF_MONTH);
        
        System.out.println("Original Date: " + date);
        System.out.println("Date after adding 5 years: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}