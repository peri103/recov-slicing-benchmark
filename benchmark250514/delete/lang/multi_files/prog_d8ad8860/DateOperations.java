import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateOperations {
    private Date date;

    public DateOperations(Date date) {
        this.date = date;
    }

    public void addHours(int hours) {
        /* write */ date = DateUtils.addHours(date, hours);
    }

    public Date getDate() {
        return date;
    }
}
