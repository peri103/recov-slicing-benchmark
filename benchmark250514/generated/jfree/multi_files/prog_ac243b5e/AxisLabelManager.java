import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;

public class AxisLabelManager {
    private Axis axis = new NumberAxis();

    public void setAxisLabel(String label) {
        /* write */ axis.setLabel(label);
    }

    public String getAxisLabel() {
        return axis.getLabel();
    }
}
