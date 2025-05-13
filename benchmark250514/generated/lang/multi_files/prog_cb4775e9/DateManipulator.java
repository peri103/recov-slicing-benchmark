import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateManipulator {
    private Date date;

    public DateManipulator(Date date) {
        this.date = date;
    }

    public void addHoursToCurrentDate(int hours) {
        /* write */ this.date = DateUtils.addHours(this.date, hours);
    }

    public Date getDate() {
        return this.date;
    }

    public Date getTruncatedDate() {
        return DateUtils.truncate(this.date, Calendar.HOUR);
    }
}
