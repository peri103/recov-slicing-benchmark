import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot and set shadow paint
        PiePlot piePlot = new PiePlot();
        Paint shadowPaint = new Color(100, 100, 100); // Example color for shadow

        /* write */ piePlot.setShadowPaint(shadowPaint);

        // Initialize XYPlot and set some properties
        XYPlot xyPlot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("X");
        NumberAxis rangeAxis = new NumberAxis("Y");
        xyPlot.setDomainAxis(domainAxis);
        xyPlot.setRangeAxis(rangeAxis);

        // Perform calculations and modify XYPlot
        for (int i = 0; i < 10; i++) {
            double x = i * Math.PI / 5.0;
            double y = Math.sin(x);
            domainAxis.setLowerBound(x);
            rangeAxis.setUpperBound(y);
        }

        // Retrieve shadow paint from PiePlot
        /* read */ Paint retrievedShadowPaint = piePlot.getShadowPaint();
        System.out.println("Retrieved Shadow Paint: " + retrievedShadowPaint);

        // Additional operations on XYPlot
        domainAxis.setUpperBound(10);
        rangeAxis.setLowerBound(-1);

        // Print final domain and range bounds
        System.out.println("Domain Axis Lower Bound: " + domainAxis.getLowerBound());
        System.out.println("Domain Axis Upper Bound: " + domainAxis.getUpperBound());
        System.out.println("Range Axis Lower Bound: " + rangeAxis.getLowerBound());
        System.out.println("Range Axis Upper Bound: " + rangeAxis.getUpperBound());
    }
}