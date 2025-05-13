import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYStepAreaRenderer object
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        
        // Create a stroke object to set as the outline stroke
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ stepAreaRenderer.setOutlineStroke(stroke);
        
        // Initialize another renderer for additional complexity
        XYLineAndShapeRenderer lineAndShapeRenderer = new XYLineAndShapeRenderer();
        
        // Set properties on the lineAndShapeRenderer
        Stroke lineStroke = new BasicStroke(1.5f);
        lineAndShapeRenderer.setSeriesStroke(0, lineStroke);
        lineAndShapeRenderer.setSeriesPaint(0, Color.RED);
        
        // Perform some unrelated operations
        int[] values = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);
        
        // More unrelated operations
        Color[] colors = {Color.BLUE, Color.GREEN, Color.YELLOW};
        for (Color color : colors) {
            System.out.println("Color: " + color);
        }
        
        // Continue with the original renderer
        /* read */ Stroke readStroke = stepAreaRenderer.getOutlineStroke();
        
        // Print out the stroke object to verify it was set correctly
        System.out.println("Outline Stroke: " + readStroke);
        
        // Additional unrelated operations
        int product = 1;
        for (int value : values) {
            product *= value;
        }
        System.out.println("Product of values: " + product);
        
        // Check properties of the second renderer
        Stroke retrievedStroke = lineAndShapeRenderer.getSeriesStroke(0);
        Color retrievedColor = (Color) lineAndShapeRenderer.getSeriesPaint(0);
        System.out.println("Line Stroke: " + retrievedStroke);
        System.out.println("Line Color: " + retrievedColor);
    }
}