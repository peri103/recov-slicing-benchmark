import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class TimePeriodManager {
    private PeriodAxis axis;

    public TimePeriodManager() {
        axis = new PeriodAxis("Sample Axis");
    }

    public void setLastPeriod(Day lastDay) {
        /* write */ axis.setLast(lastDay);
    }

    public Day getLastPeriod() {
        return axis.getLast();
    }
}
