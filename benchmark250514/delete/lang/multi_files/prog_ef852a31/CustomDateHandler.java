import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class CustomDateHandler {
    private Date date;

    public CustomDateHandler(Date date) {
        this.date = date;
    }

    public void addWeeks(int weeks) {
        /* write */ this.date = DateUtils.addWeeks(this.date, weeks);
    }

    public Date getDate() {
        return this.date;
    }
}
