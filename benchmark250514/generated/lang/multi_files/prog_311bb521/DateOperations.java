import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateOperations {
    public Date addYearsToDate(Date date, int years) {
        /* write */ return DateUtils.addYears(date, years);
    }

    public Date truncateDate(Date date) {
        /* read */ return DateUtils.truncate(date, Calendar.DATE);
    }
}