import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize a Calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        
        Date date = calendar.getTime();
        
        // Use DateUtils to set weeks
        /* write */ date = DateUtils.setWeeks(date, 2);
        
        // Use DateUtils to truncate to the start of the week
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR);
        
        // Print the truncated date
        System.out.println(truncatedDate);
    }
}