import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class DateManager {
    private Date date;

    public DateManager(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        this.date = calendar.getTime();
    }

    public void setWeek(int week) {
        /* write */ this.date = DateUtils.setWeeks(this.date, week);
    }

    public Date getDate() {
        return this.date;
    }
}
