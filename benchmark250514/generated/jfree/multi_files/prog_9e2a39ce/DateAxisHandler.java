import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;

public class DateAxisHandler {
    private DateAxis dateAxis;
    
    public DateAxisHandler() {
        this.dateAxis = new DateAxis();
    }
    
    public void setDateFormat(SimpleDateFormat dateFormat) {
        /* write */ dateAxis.setDateFormatOverride(dateFormat);
    }
    
    public SimpleDateFormat getDateFormat() {
        return (SimpleDateFormat) dateAxis.getDateFormatOverride();
    }
}