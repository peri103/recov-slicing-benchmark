import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original Plot
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return null;
            }
        };

        Paint paint = Color.BLUE;
        /* write */ plot.setBackgroundPaint(paint);

        // Additional Plots
        CategoryPlot categoryPlot = new CategoryPlot();
        XYPlot xyPlot = new XYPlot();

        // Set background paints for additional plots
        categoryPlot.setBackgroundPaint(Color.RED);
        xyPlot.setBackgroundPaint(Color.GREEN);

        // ArrayList to store plots
        ArrayList<Plot> plotList = new ArrayList<>();
        plotList.add(plot);
        plotList.add(categoryPlot);
        plotList.add(xyPlot);

        // Retrieve and print background paints from additional plots
        for (Plot p : plotList) {
            Paint bgPaint = p.getBackgroundPaint();
            System.out.println("Background Paint: " + bgPaint);
        }

        // Additional operations
        for (int i = 0; i < 5; i++) {
            categoryPlot.setBackgroundPaint(new Color(i * 50, i * 40, i * 30));
        }

        Paint retrievedPaint = null;
        for (Plot p : plotList) {
            // Perform operations
            if (p instanceof CategoryPlot) {
                retrievedPaint = p.getBackgroundPaint();
            }
        }

        /* read */ retrievedPaint = plot.getBackgroundPaint();
        System.out.println("Retrieved Paint: " + retrievedPaint);
    }
}