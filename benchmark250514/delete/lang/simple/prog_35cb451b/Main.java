import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Initialize the year to a specific value
        int year = 2023;
        
        /* write */ 
        date = DateUtils.setYears(date, year);

        /* read */ 
        Date truncatedDate = DateUtils.truncate(date, DateUtils.MILLIS_PER_DAY);

        System.out.println(truncatedDate);
    }
}