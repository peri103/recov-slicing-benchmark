import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ Date updatedDate = DateUtils.setHours(date, 10);
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.MILLIS_PER_DAY);
        
        System.out.println("Original Date: " + date);
        System.out.println("Updated Date: " + updatedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}