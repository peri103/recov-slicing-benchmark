import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot and shadow paint color
        PiePlot piePlot = new PiePlot();
        Paint shadowPaint = new Color(100, 100, 100); 

        // Initialize a CategoryPlot with a different paint color
        CategoryPlot categoryPlot = new CategoryPlot();
        Paint categoryPaint = new Color(150, 150, 150);
        categoryPlot.setDomainGridlinePaint(categoryPaint);

        // Using a HashMap to store plot information
        HashMap<String, Paint> plotPaints = new HashMap<>();
        plotPaints.put("PiePlot", shadowPaint);
        plotPaints.put("CategoryPlot", categoryPaint);

        // Iterate over the HashMap and print the paints
        for (String plotName : plotPaints.keySet()) {
            System.out.println(plotName + " Paint: " + plotPaints.get(plotName));
        }

        // Set shadow paint for PiePlot
        /* write */ piePlot.setShadowPaint(plotPaints.get("PiePlot"));

        // Additional operations on CategoryPlot
        Paint readCategoryPaint = categoryPlot.getDomainGridlinePaint();
        System.out.println("CategoryPlot Domain Gridline Paint: " + readCategoryPaint);

        // Perform some calculations using plot colors
        int colorSum = ((Color) shadowPaint).getRed() + ((Color) categoryPaint).getRed();
        System.out.println("Sum of Red components: " + colorSum);

        // Read shadow paint from PiePlot
        /* read */ Paint readShadowPaint = piePlot.getShadowPaint();
        System.out.println("PiePlot Shadow Paint: " + readShadowPaint);

        // Perform additional operations using the read shadow paint
        int shadowBlueComponent = ((Color) readShadowPaint).getBlue();
        System.out.println("Shadow Paint Blue Component: " + shadowBlueComponent);
    }
}