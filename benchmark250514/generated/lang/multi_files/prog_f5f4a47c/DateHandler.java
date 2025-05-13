import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class DateHandler {
    private Date date;
    private Date ceilingDate;

    public DateHandler(Date date) {
        this.date = date;
        calculateCeilingDate();
    }

    private void calculateCeilingDate() {
        /* write */ this.ceilingDate = DateUtils.ceiling(this.date, Calendar.HOUR);
    }

    public Date getCeilingDate() {
        return this.ceilingDate;
    }
}
