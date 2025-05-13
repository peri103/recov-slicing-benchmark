import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;

public class CrosshairLabelHandler {
    private Crosshair crosshair;

    public CrosshairLabelHandler() {
        crosshair = new Crosshair();
    }

    public void setCustomLabelGenerator(CrosshairLabelGenerator generator) {
        /* write */ crosshair.setLabelGenerator(generator);
    }

    public CrosshairLabelGenerator getLabelGenerator() {
        return crosshair.getLabelGenerator();
    }
}
