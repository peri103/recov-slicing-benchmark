import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 years to the current date
        /* write */ Date futureDate = DateUtils.addYears(currentDate, 5);
        
        // Truncate the future date to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, java.util.Calendar.DATE);
        
        System.out.println("Future Date: " + futureDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}