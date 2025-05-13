import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateTruncator {
    private Date truncatedDate;

    public DateTruncator(Date date) {
        truncateDate(date);
    }

    private void truncateDate(Date date) {
        /* read */ this.truncatedDate = DateUtils.truncate(date, Calendar.HOUR);
    }

    public Date getTruncatedDate() {
        return this.truncatedDate;
    }
}
