import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Ceiling the date to the next hour
        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);
        
        // Truncate the ceiling date to the hour
        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);
        
        System.out.println(truncatedDate);
    }
}