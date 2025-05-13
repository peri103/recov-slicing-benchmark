import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateTruncator {
    public Date truncateDate(Date date) {
        /* read */ return DateUtils.truncate(date, Calendar.SECOND);
    }
}
