import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateManipulator {
    private Date date;

    public DateManipulator(Date date) {
        this.date = date;
    }

    public Date setMinutes(int minutes) {
        /* write */ Date updatedDate = DateUtils.setMinutes(this.date, minutes);
        return updatedDate;
    }

    public Date truncateDate(Date date) {
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MINUTE);
        return truncatedDate;
    }
}