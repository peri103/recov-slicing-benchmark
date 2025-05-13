import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;

public class AxisInformation {
    private DateAxisManager manager;

    public AxisInformation(DateAxisManager manager) {
        this.manager = manager;
    }

    public String getDateFormatPattern() {
        DateAxis dateAxis = manager.getDateAxis();
        /* read */ SimpleDateFormat readFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();
        return readFormat.toPattern();
    }
}
