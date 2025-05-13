import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateManipulator {
    private Date date;

    public DateManipulator(Date date) {
        this.date = date;
    }

    public Date addWeeks(int weeks) {
        /* write */ return DateUtils.addWeeks(date, weeks);
    }

    public Date truncateDate(Date dateToTruncate) {
        return DateUtils.truncate(dateToTruncate, Calendar.DATE);
    }
}
