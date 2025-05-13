import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initial setup for PiePlot
        PiePlot piePlot = new PiePlot();
        Comparable pieKey = "Pie Section 1";
        Paint piePaint = Color.RED;

        // Setup for CategoryPlot
        CategoryPlot categoryPlot = new CategoryPlot();
        BarRenderer renderer = new BarRenderer();
        categoryPlot.setRenderer(renderer);

        // HashMap to store section colors
        HashMap<Comparable, Paint> sectionColors = new HashMap<>();
        sectionColors.put(pieKey, piePaint);

        // Set section outline paint for PiePlot
        /* write */ piePlot.setSectionOutlinePaint(pieKey, piePaint);

        // Modify BarRenderer properties
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesPaint(1, Color.GREEN);

        // Retrieve section outline paint for PiePlot
        /* read */ Paint retrievedPiePaint = piePlot.getSectionOutlinePaint(pieKey);

        // Print the retrieved paint color
        System.out.println("Retrieved Paint for Pie Section: " + retrievedPiePaint);

        // Additional operations on CategoryPlot
        for (int i = 0; i < 3; i++) {
            categoryPlot.setDomainGridlinePaint(Color.GRAY);
            categoryPlot.setRangeGridlinePaint(Color.BLACK);
        }

        // Iterate over section colors and print them
        for (Comparable key : sectionColors.keySet()) {
            Paint paint = sectionColors.get(key);
            System.out.println("Section: " + key + ", Paint: " + paint);
        }
    }
}