import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateOperations {
    private Date date;

    public DateOperations(Date date) {
        this.date = date;
    }

    public Date addYearsToDate(int years) {
        /* write */ Date newDate = DateUtils.addYears(date, years);
        return newDate;
    }

    public Date truncateDate(Date dateToTruncate) {
        /* read */ Date truncatedDate = DateUtils.truncate(dateToTruncate, Calendar.DAY_OF_MONTH);
        return truncatedDate;
    }
}