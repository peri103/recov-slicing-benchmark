import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;

public class AxisConfiguration {
    private NumberAxis axis = new NumberAxis();

    public void configureAxis(double tickUnitSize) {
        NumberTickUnit tickUnit = new NumberTickUnit(tickUnitSize);
        /* write */ axis.setTickUnit(tickUnit);
    }

    public NumberTickUnit getAxisTickUnit() {
        return axis.getTickUnit();
    }
}
