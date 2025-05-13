import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import java.util.ArrayList;
import java.util.List;

public class AxisManager {
    private List<AxisConfiguration> axisConfigurations;

    public AxisManager() {
        this.axisConfigurations = new ArrayList<>();
    }

    public void addAxisWithTickUnit(double tickSize) {
        ValueAxis axis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(tickSize);
        AxisConfiguration axisConfig = new AxisConfiguration(axis);
        axisConfig.setAxisTickUnit(tickUnit);
        axisConfigurations.add(axisConfig);
    }

    public List<AxisConfiguration> getAxisConfigurations() {
        return axisConfigurations;
    }
}