import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public class DateHandler {
    private Date date;

    public DateHandler(Date date) {
        this.date = date;
    }

    public void setHour(int hour) {
        /* write */ this.date = DateUtils.setHours(date, hour);
    }

    public Date getDate() {
        return this.date;
    }
}
