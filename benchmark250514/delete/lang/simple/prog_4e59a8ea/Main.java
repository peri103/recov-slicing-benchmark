import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add years to the current date
        /* write */ Date futureDate = DateUtils.addYears(currentDate, 5);
        
        // Truncate the future date to remove the time part
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, DateUtils.MILLIS_PER_DAY);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}