import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Round the current date to the nearest day
        /* write */ Date roundedDate = DateUtils.round(currentDate, DateUtils.SEMI_MONTH);
        
        // Truncate the rounded date to the start of the day
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, DateUtils.SEMI_MONTH);
        
        // Output the truncated date
        System.out.println(truncatedDate);
    }
}