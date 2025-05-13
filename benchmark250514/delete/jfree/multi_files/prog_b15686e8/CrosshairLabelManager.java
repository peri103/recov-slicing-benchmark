import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;

public class CrosshairLabelManager {
    private Crosshair crosshair = new Crosshair();

    public void setLabelGenerator(CrosshairLabelGenerator labelGenerator) {
        /* write */ crosshair.setLabelGenerator(labelGenerator);
    }

    public CrosshairLabelGenerator getLabelGenerator() {
        return crosshair.getLabelGenerator();
    }
}
