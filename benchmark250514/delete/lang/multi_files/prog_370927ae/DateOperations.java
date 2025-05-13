import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateOperations {
    private Date date;

    public DateOperations(Date date) {
        this.date = date;
    }

    public void addWeeks(int weeks) {
        /* write */ date = DateUtils.addWeeks(date, weeks);
    }

    public Date getTruncatedDate() {
        return DateUtils.truncate(date, Calendar.DAY_OF_MONTH);
    }

    public Date getDate() {
        return date;
    }
}
