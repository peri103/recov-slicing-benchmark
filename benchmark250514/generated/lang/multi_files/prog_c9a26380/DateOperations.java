import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateOperations {
    private Date date;

    public DateOperations(Date date) {
        this.date = date;
    }

    public void setSeconds(int seconds) {
        /* write */ this.date = DateUtils.setSeconds(this.date, seconds);
    }

    public Date getTruncatedDate() {
        return DateUtils.truncate(this.date, Calendar.SECOND);
    }

    public Date getDate() {
        return this.date;
    }
}