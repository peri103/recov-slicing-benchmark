import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateManipulator {
    private Date date;

    public DateManipulator(Date date) {
        this.date = date;
    }

    public Date addDays(int days) {
        /* write */ return DateUtils.addDays(date, days);
    }

    public Date getDate() {
        return date;
    }
}
