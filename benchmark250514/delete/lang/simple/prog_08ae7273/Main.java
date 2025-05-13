import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the seconds of the date to a specific value
        /* write */ date = DateUtils.setSeconds(date, 45);
        
        // Truncate the date to remove the seconds value
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.SECOND);
        
        // Print the truncated date, which should have seconds set to zero
        System.out.println(truncatedDate);
    }
}