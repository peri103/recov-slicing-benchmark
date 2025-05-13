import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateHandler {
    private Date currentDate;
    private Date newDate;

    public DateHandler(Date currentDate) {
        this.currentDate = currentDate;
    }

    public void addDaysToCurrentDate(int days) {
        /* write */ this.newDate = DateUtils.addDays(currentDate, days);
    }

    public Date getNewDate() {
        return this.newDate;
    }
}
