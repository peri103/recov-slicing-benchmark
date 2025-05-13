import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        /* write */ Date updatedDate = DateUtils.setSeconds(currentDate, 30);
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, java.util.Calendar.SECOND);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("Updated Date with Seconds Set: " + updatedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}