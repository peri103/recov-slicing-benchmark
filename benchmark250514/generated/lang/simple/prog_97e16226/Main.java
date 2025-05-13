import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Round the date to the nearest second
        /* write */ Date roundedDate = DateUtils.round(date, DateUtils.SEMI_MONTH);
        
        // Truncate the date to the nearest second
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, DateUtils.SEMI_MONTH);
        
        System.out.println("Original Date: " + date);
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}