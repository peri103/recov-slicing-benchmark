import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.BasicStroke;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        // Initialize a plot and a chart for demonstration purposes
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYPlot plot = new XYPlot(null, xAxis, yAxis, renderer);
        JFreeChart chart = new JFreeChart("Demo Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Set additional properties on the renderer
        renderer.setPositivePaint(Color.GREEN);
        renderer.setStroke(new BasicStroke(2.0f));
        
        // Perform calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* write */ renderer.setNegativePaint(Color.RED);
        
        // Simulate more complex logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        // Retrieve the negative paint color
        /* read */ Color negativePaint = (Color) renderer.getNegativePaint();
        
        System.out.println("Negative paint color: " + negativePaint);
        
        // Use the chart for some hypothetical rendering logic
        chart.setBackgroundPaint(Color.WHITE);
        chart.setBorderPaint(Color.BLACK);
        
        System.out.println("Chart background and border set.");
    }
}