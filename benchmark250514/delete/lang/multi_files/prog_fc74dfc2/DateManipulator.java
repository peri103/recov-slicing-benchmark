import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateManipulator {
    private Date date;

    public DateManipulator() {
        this.date = new Date();
    }

    public void setSeconds(int seconds) {
        /* write */ this.date = DateUtils.setSeconds(this.date, seconds);
    }

    public Date getDate() {
        return this.date;
    }
}
