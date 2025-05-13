import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        
        // Additional setup for the XYPlot
        ValueAxis domainAxis = new NumberAxis("X Axis");
        ValueAxis rangeAxis = new NumberAxis("Y Axis");
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);

        // Set the gridline paint color
        /* write */ plot.setRangeGridlinePaint(Color.RED);
        
        // Perform some unrelated operations
        XYPlot anotherPlot = new XYPlot();
        anotherPlot.setDomainAxis(new NumberAxis("Another X Axis"));
        anotherPlot.setRangeAxis(new NumberAxis("Another Y Axis"));
        anotherPlot.setRangeGridlinePaint(Color.BLUE);

        // More complex logic
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                plot.setRangeGridlinePaint(Color.GREEN);
            } else {
                plot.setRangeGridlinePaint(Color.YELLOW);
            }
        }

        // Retrieve the gridline paint color
        /* read */ Paint gridlinePaint = plot.getRangeGridlinePaint();
        
        // Output the gridline paint color
        System.out.println("Final Gridline Paint: " + gridlinePaint);

        // Additional unrelated operations
        XYPlot yetAnotherPlot = new XYPlot();
        yetAnotherPlot.setRangeGridlinePaint(Color.BLACK);
        Paint anotherGridlinePaint = yetAnotherPlot.getRangeGridlinePaint();
        System.out.println("Another Gridline Paint: " + anotherGridlinePaint);
    }
}