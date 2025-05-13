import org.jfree.chart.plot.XYPlot;
import java.awt.Paint;
import java.awt.Color;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");

        // Set up domain and range axes
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        
        // Set plot orientation
        plot.setOrientation(PlotOrientation.VERTICAL);

        // Perform some operations with the axes
        domainAxis.setTickLabelsVisible(true);
        rangeAxis.setTickLabelsVisible(true);

        // Initialize Paint object
        Paint paint = Color.RED;
        
        // Set domain gridline paint
        /* write */ plot.setDomainGridlinePaint(paint);
        
        // Perform other operations
        domainAxis.setAutoRangeIncludesZero(false);
        rangeAxis.setAutoRangeIncludesZero(false);
        
        // Retrieve and print the domain gridline paint
        /* read */ Paint retrievedPaint = plot.getDomainGridlinePaint();
        System.out.println(retrievedPaint);

        // Additional operations on the plot
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);

        // Print plot orientation
        System.out.println("Plot orientation: " + plot.getOrientation());
    }
}