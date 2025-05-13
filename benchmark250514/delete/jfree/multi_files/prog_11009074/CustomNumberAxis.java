import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;

public class CustomNumberAxis {
    private NumberAxis numberAxis = new NumberAxis();

    public void setCustomTickUnit(double size) {
        TickUnit tickUnit = new TickUnit(size);
        /* write */ numberAxis.setTickUnit(tickUnit);
    }

    public NumberAxis getNumberAxis() {
        return numberAxis;
    }
}
