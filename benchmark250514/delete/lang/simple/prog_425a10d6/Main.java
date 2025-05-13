import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Set the month to February (1 in zero-based index)
        /* write */ date = DateUtils.setMonths(date, 1);
        
        // Truncate the date to the start of the month
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.MONDAY);
        
        System.out.println(truncatedDate);
    }
}