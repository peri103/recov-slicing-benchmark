import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class PaintManager {
    private HashMap<String, Paint> plotPaints = new HashMap<>();

    public PaintManager() {
        // Initialize default paints
        plotPaints.put("PiePlot", new Color(100, 100, 100));
        plotPaints.put("CategoryPlot", new Color(150, 150, 150));
    }

    public void setPaint(String plotName, Paint paint) {
        /* write */ plotPaints.put(plotName, paint);
    }

    public Paint getPaint(String plotName) {
        return plotPaints.get(plotName);
    }

    public void printAllPaints() {
        for (String plotName : plotPaints.keySet()) {
            System.out.println(plotName + " Paint: " + plotPaints.get(plotName));
        }
    }
}
