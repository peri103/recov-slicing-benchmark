import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add 2 months to the current date
        /* write */ Date newDate = DateUtils.addMonths(date, 2);
        
        // Truncate the new date to remove the time component
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.DAY_OF_MONTH);
        
        // Format the date to display it
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(truncatedDate));
    }
}