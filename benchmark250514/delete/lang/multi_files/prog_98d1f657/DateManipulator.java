import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateManipulator {
    private Date date;

    public DateManipulator(Date date) {
        this.date = date;
    }

    public void addSecondsToDate(int seconds) {
        /* write */ this.date = DateUtils.addSeconds(this.date, seconds);
    }

    public Date getDate() {
        return this.date;
    }
}
