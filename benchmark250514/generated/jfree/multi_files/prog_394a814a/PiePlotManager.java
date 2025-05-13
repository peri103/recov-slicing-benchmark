import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class PiePlotManager {
    private PiePlot piePlot;
    private Map<String, Paint> sectionPaints;

    public PiePlotManager() {
        this.piePlot = new PiePlot();
        this.sectionPaints = new HashMap<>();
    }

    public void setSectionOutline(String section, Color color) {
        /* write */ piePlot.setSectionOutlinePaint(section, color);
        sectionPaints.put(section, color);
    }

    public Paint getSectionOutline(String section) {
        return piePlot.getSectionOutlinePaint(section);
    }

    public Map<String, Paint> getAllSectionPaints() {
        return sectionPaints;
    }
}
