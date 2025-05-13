import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateTruncator {
    public Date truncateToSeconds(Date date) {
        /* read */ return DateUtils.truncate(date, DateUtils.SECOND);
    }
}
