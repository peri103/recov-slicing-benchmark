import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Add 5 years to the current date
        /* write */ Date futureDate = DateUtils.addYears(currentDate, 5);
        
        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, java.util.Calendar.DATE);
        
        System.out.println(truncatedDate);
    }
}