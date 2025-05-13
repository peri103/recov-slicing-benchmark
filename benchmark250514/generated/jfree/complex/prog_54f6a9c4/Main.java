import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        BasicStroke stroke = new BasicStroke(2.0f);

        // Additional complex logic
        Map<String, BasicStroke> strokeMap = new HashMap<>();
        strokeMap.put("SectionKey", stroke);
        strokeMap.put("AnotherSection", new BasicStroke(3.0f));

        for (Map.Entry<String, BasicStroke> entry : strokeMap.entrySet()) {
            piePlot.setSectionOutlineStroke(entry.getKey(), entry.getValue());
        }

        // More unrelated calculations
        int sum = 0;
        for (BasicStroke s : strokeMap.values()) {
            sum += s.getLineWidth();
        }
        System.out.println("Sum of line widths: " + sum);

        // Writing to PiePlot
        /* write */ piePlot.setSectionOutlineStroke("SectionKey", stroke);

        // More complex logic
        int product = 1;
        for (BasicStroke s : strokeMap.values()) {
            product *= s.getLineWidth();
        }
        System.out.println("Product of line widths: " + product);

        // Reading from PiePlot
        /* read */ BasicStroke readStroke = (BasicStroke) piePlot.getSectionOutlineStroke("SectionKey");

        System.out.println("Read line width: " + readStroke.getLineWidth());

        // Additional unrelated code
        int maxLineWidth = 0;
        for (String key : strokeMap.keySet()) {
            BasicStroke s = strokeMap.get(key);
            if (s.getLineWidth() > maxLineWidth) {
                maxLineWidth = (int) s.getLineWidth();
            }
        }
        System.out.println("Max line width: " + maxLineWidth);
    }
}