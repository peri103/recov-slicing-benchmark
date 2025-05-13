import org.jfree.chart.plot.PiePlot;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class ColorManager {
    private PiePlot piePlot;
    private Map<Comparable, Paint> sectionPaints;

    public ColorManager() {
        this.piePlot = new PiePlot();
        this.sectionPaints = new HashMap<>();
    }

    public void addSectionPaint(Comparable key, Paint paint) {
        /* write */ piePlot.setSectionPaint(key, paint);
        sectionPaints.put(key, paint);
    }

    public PiePlot getPiePlot() {
        return piePlot;
    }
}
