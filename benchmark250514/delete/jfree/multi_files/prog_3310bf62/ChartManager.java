import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;

public class ChartManager {
    private NumberAxis axis;

    public ChartManager() {
        this.axis = new NumberAxis();
    }

    public void configureAxisTickUnit(double unitSize) {
        NumberTickUnit tickUnit = new NumberTickUnit(unitSize);
        /* write */ axis.setTickUnit(tickUnit);
    }

    public NumberTickUnit getAxisTickUnit() {
        return axis.getTickUnit();
    }
}
