import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        
        // Add 10 seconds to the current date
        /* write */ Date futureDate = DateUtils.addSeconds(now, 10);
        
        // Truncate the futureDate to remove seconds
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, DateUtils.SECOND);
        
        // Print the truncatedDate
        System.out.println(truncatedDate);
    }
}