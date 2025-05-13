import org.jfree.chart.axis.ValueAxis;
import org.jfree.data.Range;

public class RangeReader {
    private ValueAxis valueAxis;

    public RangeReader(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
    }

    public Range readRange() {
        /* read */ return valueAxis.getRange();
    }
}
