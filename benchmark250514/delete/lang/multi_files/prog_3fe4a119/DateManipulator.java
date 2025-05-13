import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateManipulator {
    private Date date;

    public DateManipulator() {
        this.date = new Date();
    }

    public Date setSeconds(int seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        /* write */ this.date = DateUtils.setSeconds(calendar.getTime(), seconds);
        return this.date;
    }

    public Date getDate() {
        return this.date;
    }
}
