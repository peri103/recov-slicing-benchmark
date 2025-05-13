import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a custom Plot
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };

        // Create a CategoryPlot and XYPlot with different background paints
        CategoryPlot categoryPlot = new CategoryPlot();
        categoryPlot.setBackgroundPaint(Color.RED);

        XYPlot xyPlot = new XYPlot();
        xyPlot.setBackgroundPaint(Color.GREEN);

        // List to store plots
        ArrayList<Plot> plots = new ArrayList<>();
        plots.add(categoryPlot);
        plots.add(xyPlot);

        // Manipulate the list and print plot types
        for (Plot p : plots) {
            System.out.println("Plot Type: " + p.getPlotType());
        }

        // Set the background paint for the custom Plot
        /* write */ plot.setBackgroundPaint(Color.BLUE);

        // Retrieve and print the background paint of the custom Plot
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        System.out.println("Background Paint: " + backgroundPaint);

        // Further manipulation of plots
        for (Plot p : plots) {
            if (p instanceof CategoryPlot) {
                ((CategoryPlot) p).setBackgroundPaint(Color.YELLOW);
            } else if (p instanceof XYPlot) {
                ((XYPlot) p).setBackgroundPaint(Color.ORANGE);
            }
        }

        // Print updated background paints
        for (Plot p : plots) {
            System.out.println("Updated Background Paint: " + p.getBackgroundPaint());
        }
    }
}