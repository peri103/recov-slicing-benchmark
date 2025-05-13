import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateManipulator {
    private Date modifiedDate;

    public void addMonthToDate(Date date) {
        /* write */ modifiedDate = DateUtils.addMonths(date, 1);
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }
}