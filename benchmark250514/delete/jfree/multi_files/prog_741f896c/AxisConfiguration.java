import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.TickUnit;

public class AxisConfiguration {
    private ValueAxis axis;

    public AxisConfiguration(ValueAxis axis) {
        this.axis = axis;
    }

    public void setAxisTickUnit(TickUnit tickUnit) {
        /* write */ axis.setTickUnit(tickUnit);
    }

    public TickUnit getAxisTickUnit() {
        return axis.getTickUnit();
    }
}