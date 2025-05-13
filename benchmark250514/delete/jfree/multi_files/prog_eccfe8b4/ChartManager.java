import org.jfree.chart.plot.PiePlot;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ChartManager {
    private PiePlot plot;
    private Map<String, Color> sectionColors;

    public ChartManager() {
        plot = new PiePlot();
        sectionColors = new HashMap<>();
        sectionColors.put("Section1", Color.RED);
        sectionColors.put("Section2", Color.BLUE);
        sectionColors.put("Section3", Color.GREEN);

        for (Map.Entry<String, Color> entry : sectionColors.entrySet()) {
            plot.setSectionPaint(entry.getKey(), entry.getValue());
        }
    }

    public void setSectionOutlineStroke(String section, Stroke stroke) {
        /* write */ plot.setSectionOutlineStroke(section, stroke);
    }

    public Stroke getSectionOutlineStroke(String section) {
        return plot.getSectionOutlineStroke(section);
    }

    public void printSectionColors() {
        for (String section : sectionColors.keySet()) {
            Color color = plot.getSectionPaint(section);
            System.out.println("Color of " + section + ": " + color);
        }
    }
}
