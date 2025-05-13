import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateManipulator {
    private Date date;

    public DateManipulator(Date date) {
        this.date = date;
    }

    public void addYearsToDate(int years) {
        /* write */ this.date = DateUtils.addYears(this.date, years);
    }

    public Date getTruncatedDate() {
        /* read */ return DateUtils.truncate(this.date, Calendar.DAY_OF_MONTH);
    }

    public Date getDate() {
        return this.date;
    }
}
