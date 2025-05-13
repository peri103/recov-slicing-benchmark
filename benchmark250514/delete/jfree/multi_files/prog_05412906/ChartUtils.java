import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class ChartUtils {
    private PiePlot piePlot;

    public ChartUtils() {
        piePlot = new PiePlot();
    }

    public void configureChart() {
        /* write */ piePlot.setOutlinePaint(Color.RED);
    }

    public PiePlot getPiePlot() {
        return piePlot;
    }
}
