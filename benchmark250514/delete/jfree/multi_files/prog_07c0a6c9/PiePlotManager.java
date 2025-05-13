import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

public class PiePlotManager {
    private PiePlot piePlot;

    public PiePlotManager() {
        piePlot = new PiePlot();
    }

    public void configureLabelGenerator() {
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        /* write */ piePlot.setLabelGenerator(labelGenerator);
    }

    public PieSectionLabelGenerator retrieveLabelGenerator() {
        return piePlot.getLabelGenerator();
    }
}
