import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add months to the current date
        /* write */ Date futureDate = DateUtils.addMonths(currentDate, 3);

        // Truncate the future date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, DateUtils.MILLIS_IN_DAY);

        System.out.println("Future Date: " + futureDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}