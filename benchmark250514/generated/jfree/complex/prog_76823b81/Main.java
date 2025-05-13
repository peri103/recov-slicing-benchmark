import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        XYPlot anotherPlot = new XYPlot();
        
        // Additional setup for the plots
        NumberAxis domainAxis = new NumberAxis("X-Axis");
        NumberAxis rangeAxis = new NumberAxis("Y-Axis");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);

        anotherPlot.setDomainAxis(new NumberAxis("Another X-Axis"));
        anotherPlot.setRangeAxis(new NumberAxis("Another Y-Axis"));
        anotherPlot.setRenderer(new XYLineAndShapeRenderer());

        // Setting orientation
        plot.setOrientation(PlotOrientation.VERTICAL);
        anotherPlot.setOrientation(PlotOrientation.HORIZONTAL);
        
        // Setting gridline paint
        /* write */ plot.setDomainGridlinePaint(Color.RED);
        anotherPlot.setDomainGridlinePaint(Color.BLUE);

        // Perform some calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Sum of squares: " + sum);

        // More complex operations
        Color anotherPaint = (Color) anotherPlot.getDomainGridlinePaint();
        System.out.println("Another plot gridline paint: " + anotherPaint);

        // Reading the original gridline paint
        /* read */ Color paint = (Color) plot.getDomainGridlinePaint();
        System.out.println("Original plot gridline paint: " + paint);
    }
}