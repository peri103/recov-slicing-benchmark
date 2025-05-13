import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;

public class AxisLabelManager {
    private Axis axis;

    public AxisLabelManager() {
        axis = new CategoryAxis();
    }

    public void setLabel(String label) {
        /* write */ axis.setLabel(label);
    }

    public String getLabel() {
        return axis.getLabel();
    }
}
