import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        
        // Setting up PiePlot with colors
        Map<String, Color> sectionColors = new HashMap<>();
        sectionColors.put("Section1", Color.RED);
        sectionColors.put("Section2", Color.BLUE);
        sectionColors.put("Section3", Color.GREEN);

        // Write operation for PiePlot
        /* write */ piePlot.setSectionOutlinePaint("Section1", sectionColors.get("Section1"));

        // Adding multiple section colors to PiePlot
        for (Map.Entry<String, Color> entry : sectionColors.entrySet()) {
            piePlot.setSectionOutlinePaint(entry.getKey(), entry.getValue());
        }

        // Complex operations with CategoryPlot
        categoryPlot.setDomainGridlinePaint(Color.YELLOW);
        categoryPlot.setRangeGridlinePaint(Color.ORANGE);

        // Simulate some operations with CategoryPlot
        Paint domainPaint = categoryPlot.getDomainGridlinePaint();
        Paint rangePaint = categoryPlot.getRangeGridlinePaint();
        System.out.println("Domain Gridline Paint: " + domainPaint);
        System.out.println("Range Gridline Paint: " + rangePaint);

        // Read operation for PiePlot
        /* read */ Paint paint = piePlot.getSectionOutlinePaint("Section1");
        System.out.println("Section1 Outline Paint: " + paint);

        // Further operations with PiePlot
        for (String section : sectionColors.keySet()) {
            Paint sectionPaint = piePlot.getSectionOutlinePaint(section);
            System.out.println(section + " Outline Paint: " + sectionPaint);
        }

        // Additional unrelated computations
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i * i;
        }
        System.out.println("Sum of squares: " + result);
    }
}