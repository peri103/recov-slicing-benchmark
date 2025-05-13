import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateProcessor {
    private Date date;

    public DateProcessor(Date date) {
        this.date = date;
    }

    public Date truncateToWeek() {
        /* read */ return DateUtils.truncate(this.date, Calendar.WEEK_OF_YEAR);
    }
}
