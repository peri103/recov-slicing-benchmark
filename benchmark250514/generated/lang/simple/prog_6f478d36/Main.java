import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Use DateUtils to add days to the current date
        /* write */ Date futureDate = DateUtils.addDays(currentDate, 5);
        
        // Use DateUtils to truncate the future date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, java.util.Calendar.DAY_OF_MONTH);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}