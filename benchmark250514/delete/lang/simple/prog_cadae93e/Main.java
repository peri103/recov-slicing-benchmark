import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the year to 2023
        /* write */ date = DateUtils.setYears(date, 2023);
        
        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.MILLIS_PER_DAY);
        
        System.out.println(truncatedDate);
    }
}