import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateOperations {
    private Date date;

    public DateOperations(Date date) {
        this.date = date;
    }

    public Date setMinutes(int minutes) {
        /* write */
        return DateUtils.setMinutes(this.date, minutes);
    }
}
