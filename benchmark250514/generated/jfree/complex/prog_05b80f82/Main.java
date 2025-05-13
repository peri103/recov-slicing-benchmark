import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot piePlot = new PiePlot();
        
        // Create a Color object to set as the label shadow paint
        Color shadowPaint = new Color(100, 100, 100); // Gray color
        
        // Initialize another plot for demonstration
        CategoryPlot categoryPlot = new CategoryPlot();
        
        // Set and retrieve axis properties in CategoryPlot
        NumberAxis numberAxis = new NumberAxis("Sample Axis");
        categoryPlot.setRangeAxis(numberAxis);
        NumberAxis retrievedAxis = (NumberAxis) categoryPlot.getRangeAxis();
        System.out.println("Axis Label: " + retrievedAxis.getLabel());
        
        // Modify the axis label
        retrievedAxis.setLabel("Updated Axis");
        System.out.println("Updated Axis Label: " + retrievedAxis.getLabel());
        
        /* write */ piePlot.setLabelShadowPaint(shadowPaint);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
        
        // Another unrelated operation with colors
        Color newColor = new Color(200, 150, 100);
        System.out.println("New Color: " + newColor);
        
        /* read */ Paint retrievedShadowPaint = piePlot.getLabelShadowPaint();
        
        // Print the retrieved color to verify it matches the one set
        System.out.println("Label Shadow Paint: " + retrievedShadowPaint);
        
        // Further unrelated operations
        double[] values = {1.0, 2.5, 3.8};
        double total = 0;
        for (double value : values) {
            total += value;
        }
        System.out.println("Total of values array: " + total);
    }
}