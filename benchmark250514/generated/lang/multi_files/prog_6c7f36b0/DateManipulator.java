import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateManipulator {
    private Date date;

    public DateManipulator(Date date) {
        this.date = date;
    }

    public Date addWeeks(int weeks) {
        /* write */ return DateUtils.addWeeks(date, weeks);
    }
}
