import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        /* write */ Date newDate = DateUtils.addHours(date, 5);
        
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.HOUR);
        
        System.out.println("Original Date: " + date);
        System.out.println("Date after adding hours: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}