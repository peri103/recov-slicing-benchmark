import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.HashMap;
import java.util.Map;

public class StrokeManager {
    private PiePlot plot = new PiePlot();
    private Map<String, Stroke> strokeMap = new HashMap<>();

    public StrokeManager() {
        Stroke initialStroke = new BasicStroke(2.0f);
        /* write */ plot.setSectionOutlineStroke("SectionKey", initialStroke);
    }

    public void addStroke(String key, Stroke stroke) {
        strokeMap.put(key, stroke);
        plot.setSectionOutlineStroke(key, stroke);
    }

    public Stroke getStroke(String key) {
        return plot.getSectionOutlineStroke(key);
    }
}
