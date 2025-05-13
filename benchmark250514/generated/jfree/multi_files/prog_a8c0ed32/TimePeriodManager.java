import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;

public class TimePeriodManager {
    private PeriodAxis periodAxis;

    public TimePeriodManager(String axisName) {
        this.periodAxis = new PeriodAxis(axisName);
    }

    public void setFirstPeriod(RegularTimePeriod period) {
        /* write */ periodAxis.setFirst(period);
    }

    public RegularTimePeriod getFirstPeriod() {
        return periodAxis.getFirst();
    }
}