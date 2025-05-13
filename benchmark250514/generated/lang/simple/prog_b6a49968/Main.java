import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        /* write */ Date newDate = DateUtils.addWeeks(date, 1);
        
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.DATE);
        
        System.out.println(truncatedDate);
    }
}