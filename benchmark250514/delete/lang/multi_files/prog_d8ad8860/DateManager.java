import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateManager {
    private DateOperations dateOperations;

    public DateManager(Date date) {
        this.dateOperations = new DateOperations(date);
    }

    public void addHoursToDate(int hours) {
        dateOperations.addHours(hours);
    }

    public Date truncateDate() {
        Date currentDate = dateOperations.getDate();
        /* read */ return DateUtils.truncate(currentDate, DateUtils.HOUR_OF_DAY);
    }
}
