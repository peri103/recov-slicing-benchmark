import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize XYPlot with additional configurations
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        NumberAxis domainAxis = new NumberAxis("X-Axis");
        NumberAxis rangeAxis = new NumberAxis("Y-Axis");
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);

        // Set the domain gridline paint
        Paint paint = Color.RED;
        /* write */ plot.setDomainGridlinePaint(paint);

        // Perform other operations on the plot
        plot.setRangeGridlinePaint(Color.BLUE);
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);

        // Initialize a new plot for additional complexity
        XYPlot anotherPlot = new XYPlot();
        anotherPlot.setOrientation(PlotOrientation.HORIZONTAL);
        anotherPlot.setDomainAxis(new NumberAxis("X-Axis 2"));
        anotherPlot.setRangeAxis(new NumberAxis("Y-Axis 2"));
        anotherPlot.setDomainGridlinePaint(Color.GREEN);
        anotherPlot.setRangeGridlinePaint(Color.YELLOW);

        // Read the domain gridline paint from the original plot
        /* read */ Paint readPaint = plot.getDomainGridlinePaint();
        System.out.println("Domain Gridline Paint: " + readPaint);

        // Perform some calculations unrelated to the plots
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More operations on anotherPlot
        anotherPlot.setDomainCrosshairVisible(false);
        anotherPlot.setRangeCrosshairVisible(false);

        // Print properties of anotherPlot for additional complexity
        System.out.println("Another Plot Domain Gridline Paint: " + anotherPlot.getDomainGridlinePaint());
        System.out.println("Another Plot Range Gridline Paint: " + anotherPlot.getRangeGridlinePaint());
    }
}