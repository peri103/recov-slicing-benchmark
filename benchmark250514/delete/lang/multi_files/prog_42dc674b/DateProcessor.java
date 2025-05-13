import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateProcessor {
    public Date truncateDate(Date date) {
        /* read */ return DateUtils.truncate(date, DateUtils.MILLIS_IN_MINUTE);
    }

    public void printDate(Date date) {
        System.out.println("Processed Date: " + date);
    }
}
