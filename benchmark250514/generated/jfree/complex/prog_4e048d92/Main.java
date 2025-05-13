import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PolarPlot polarPlot = new PolarPlot();
        Paint angleGridlinePaint = Color.RED;
        /* write */ polarPlot.setAngleGridlinePaint(angleGridlinePaint);

        // Create another plot and set some attributes
        XYPlot xyPlot = new XYPlot();
        Paint domainGridlinePaint = Color.BLUE;
        xyPlot.setDomainGridlinePaint(domainGridlinePaint);

        // Create a list of plots
        List<Plot> plots = new ArrayList<>();
        plots.add(polarPlot);
        plots.add(xyPlot);

        // Iterate over the list and perform some operations
        for (Plot plot : plots) {
            if (plot instanceof PolarPlot) {
                PolarPlot pPlot = (PolarPlot) plot;
                System.out.println("PolarPlot detected.");
                // Perform operations specific to PolarPlot
                Paint currentPaint = pPlot.getAngleGridlinePaint();
                System.out.println("Current Angle Gridline Paint: " + currentPaint);
            } else if (plot instanceof XYPlot) {
                XYPlot xPlot = (XYPlot) plot;
                System.out.println("XYPlot detected.");
                // Perform operations specific to XYPlot
                Paint currentPaint = xPlot.getDomainGridlinePaint();
                System.out.println("Current Domain Gridline Paint: " + currentPaint);
            }
        }

        // More operations on polarPlot
        polarPlot.setRadiusGridlinePaint(Color.GREEN);

        // Final read operation
        /* read */ Paint readPaint = polarPlot.getAngleGridlinePaint();
        System.out.println("Read Angle Gridline Paint: " + readPaint);
    }
}