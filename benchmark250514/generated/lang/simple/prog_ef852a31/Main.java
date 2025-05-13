import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        /* write */ Date dateAfterAddingWeeks = DateUtils.addWeeks(currentDate, 2);
        
        /* read */ Date truncatedDate = DateUtils.truncate(dateAfterAddingWeeks, java.util.Calendar.DATE);
        
        System.out.println(truncatedDate);
    }
}