import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;

public class DateAxisManager {
    private DateAxis dateAxis;

    public DateAxisManager() {
        this.dateAxis = new DateAxis();
    }

    public void setDateFormat(String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        /* write */ dateAxis.setDateFormatOverride(dateFormat);
    }

    public DateAxis getDateAxis() {
        return dateAxis;
    }
}
