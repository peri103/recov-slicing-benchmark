import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;

public class AxisManager {
    private Axis axis = new NumberAxis();

    public AxisManager() {
        /* write */ axis.setLabel("Sample Label");
    }

    public String getAxisLabel() {
        return axis.getLabel();
    }
}
