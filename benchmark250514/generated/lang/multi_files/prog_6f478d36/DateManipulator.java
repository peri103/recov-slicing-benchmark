import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateManipulator {
    private Date currentDate;

    public DateManipulator(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date addDaysToDate(int days) {
        /* write */ return DateUtils.addDays(currentDate, days);
    }
    
    public Date truncateDate(Date date) {
        /* read */ return DateUtils.truncate(date, Calendar.DAY_OF_MONTH);
    }
}
