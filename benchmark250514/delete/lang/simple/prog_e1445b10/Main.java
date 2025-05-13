import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        
        // Add seconds to the current date
        /* write */ Date modifiedDate = DateUtils.addSeconds(now, 10);
        
        // Truncate the modified date to the nearest minute
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.MILLIS_IN_MINUTE);
        
        System.out.println("Original Date: " + now);
        System.out.println("Modified Date: " + modifiedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}