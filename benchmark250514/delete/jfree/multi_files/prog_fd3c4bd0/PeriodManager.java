import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.RegularTimePeriod;

public class PeriodManager {
    private PeriodAxis periodAxis;

    public PeriodManager(String axisLabel) {
        periodAxis = new PeriodAxis(axisLabel);
    }

    public void setLastPeriod(RegularTimePeriod period) {
        /* write */ periodAxis.setLast(period);
    }

    public RegularTimePeriod getLastPeriod() {
        return periodAxis.getLast();
    }
}