import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class PeriodManager {
    private PeriodAxis axis;

    public PeriodManager() {
        this.axis = new PeriodAxis("Sample Axis");
    }

    public void setFirstPeriod(Day day) {
        /* write */ axis.setFirst(day);
    }

    public Day getFirstPeriod() {
        return (Day) axis.getFirst();
    }
}