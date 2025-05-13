import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class ChartRange {
    private ValueAxis axis;

    public ChartRange() {
        this.axis = new NumberAxis();
    }

    public void setAxisRange(double lower, double upper) {
        Range newRange = new Range(lower, upper);
        /* write */ axis.setRange(newRange);
    }

    public Range getAxisRange() {
        return axis.getRange();
    }
}
