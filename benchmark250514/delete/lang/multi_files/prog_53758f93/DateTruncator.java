import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateTruncator {

    public Date truncateToMinute(Date date) {
        /* read */
        return DateUtils.truncate(date, DateUtils.MILLIS_IN_MINUTE);
    }
}
