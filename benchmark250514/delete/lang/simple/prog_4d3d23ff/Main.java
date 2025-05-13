import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        
        // Set seconds to a specific value
        /* write */ Date modifiedDate = DateUtils.setSeconds(now, 30);
        
        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.SECOND);
        
        System.out.println(truncatedDate);
    }
}