import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class RangeManager {
    private ValueAxis axis;

    public RangeManager() {
        this.axis = new NumberAxis();
    }

    public void setRange(Range range) {
        /* write */ axis.setRange(range);
    }

    public Range getRange() {
        return axis.getRange();
    }
}