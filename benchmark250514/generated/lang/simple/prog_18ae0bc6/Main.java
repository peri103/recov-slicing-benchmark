import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add weeks to the current date
        /* write */ date = DateUtils.addWeeks(date, 2);
        
        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(date, java.util.Calendar.DATE);
        
        System.out.println(truncatedDate);
    }
}