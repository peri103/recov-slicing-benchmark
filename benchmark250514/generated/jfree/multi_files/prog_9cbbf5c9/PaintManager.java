import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class PaintManager {
    private PiePlot plot;
    private Map<Comparable, Color> sectionColors;

    public PaintManager() {
        this.plot = new PiePlot();
        this.sectionColors = new HashMap<>();
    }

    public void addSectionPaint(Comparable key, Color color) {
        /* write */ plot.setSectionPaint(key, color);
        sectionColors.put(key, color);
    }

    public Paint getSectionPaint(Comparable key) {
        return plot.getSectionPaint(key);
    }

    public Map<Comparable, Paint> getAllSectionPaints() {
        Map<Comparable, Paint> paints = new HashMap<>();
        for (Comparable key : sectionColors.keySet()) {
            paints.put(key, plot.getSectionPaint(key));
        }
        return paints;
    }
}
