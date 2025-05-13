import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class ValueAxisManager {
    private ValueAxis valueAxis;

    public ValueAxisManager() {
        this.valueAxis = new NumberAxis();
    }

    public void setInitialRange(double lower, double upper) {
        Range initialRange = new Range(lower, upper);
        /* write */ valueAxis.setRange(initialRange);
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }
}
