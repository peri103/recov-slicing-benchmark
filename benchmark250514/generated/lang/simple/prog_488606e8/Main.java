import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add 5 years to the current date
        /* write */ Date newDate = DateUtils.addYears(date, 5);
        
        // Truncate the new date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.DATE);
        
        System.out.println(truncatedDate);
    }
}