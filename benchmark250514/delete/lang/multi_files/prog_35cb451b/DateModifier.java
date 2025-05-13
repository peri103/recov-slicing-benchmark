import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class DateModifier {
    private Date date;

    public DateModifier(Date date) {
        this.date = date;
    }

    public void setYear(int year) {
        /* write */ 
        this.date = DateUtils.setYears(this.date, year);
    }

    public Date getDate() {
        return this.date;
    }
}
