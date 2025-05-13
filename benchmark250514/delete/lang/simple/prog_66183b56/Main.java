import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date modifiedDate;
        
        // Set the month of the current date to February (month index 1)
        /* write */ modifiedDate = DateUtils.setMonths(currentDate, 1);
        
        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.MILLIS_IN_DAY);
        
        System.out.println(truncatedDate);
    }
}