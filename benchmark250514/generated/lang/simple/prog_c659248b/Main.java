import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        
        // Round the current date to the nearest day
        /* write */ Date roundedDate = DateUtils.round(now, Calendar.DAY_OF_MONTH);
        
        // Truncate the rounded date to remove any time components
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.DAY_OF_MONTH);
        
        System.out.println(truncatedDate);
    }
}