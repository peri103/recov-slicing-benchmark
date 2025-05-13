import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateHandler {
    private Date date;

    public DateHandler() {
        this.date = new Date();
    }

    public void setMinutes(int minutes) {
        /* write */ this.date = DateUtils.setMinutes(this.date, minutes);
    }

    public Date getDate() {
        return this.date;
    }
}
