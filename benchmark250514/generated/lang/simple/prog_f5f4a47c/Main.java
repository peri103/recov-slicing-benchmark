import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);

        /* read */ Date truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);

        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}