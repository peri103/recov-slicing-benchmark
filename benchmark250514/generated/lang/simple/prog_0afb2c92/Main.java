import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Adding 2 weeks to the current date
        /* write */ Date newDate = DateUtils.addWeeks(currentDate, 2);
        
        // Truncating the new date to remove time part
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.DATE);
        
        System.out.println(truncatedDate);
    }
}