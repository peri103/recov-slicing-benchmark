import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateOperations {
    private Date date;

    public DateOperations(Date date) {
        this.date = date;
    }

    public void setSeconds(int seconds) {
        /* write */ date = DateUtils.setSeconds(date, seconds);
    }

    public Date getDate() {
        return date;
    }
}
