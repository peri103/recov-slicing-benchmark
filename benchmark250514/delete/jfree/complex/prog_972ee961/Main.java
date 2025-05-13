import org.jfree.chart.renderer.xy.XYShapeRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize XYShapeRenderer
        XYShapeRenderer shapeRenderer = new XYShapeRenderer();
        
        // Initialize XYLineAndShapeRenderer
        XYLineAndShapeRenderer lineAndShapeRenderer = new XYLineAndShapeRenderer();
        
        // Initialize ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add numbers to ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        // Perform operations on ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Set properties for lineAndShapeRenderer
        lineAndShapeRenderer.setBaseShapesVisible(true);
        lineAndShapeRenderer.setSeriesLinesVisible(0, true);
        
        // Perform more operations
        int product = 1;
        for (int num : numbers) {
            product *= num + 1;
        }
        
        // Set properties for shapeRenderer
        /* write */ shapeRenderer.setDrawOutlines(true);
        
        // Perform operations using the renderers
        boolean baseShapesVisible = lineAndShapeRenderer.getBaseShapesVisible();
        boolean seriesLinesVisible = lineAndShapeRenderer.getSeriesLinesVisible(0);
        
        // Further operations
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        
        // Read the property set earlier
        /* read */ boolean drawOutlines = shapeRenderer.getDrawOutlines();
        
        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max: " + max);
        System.out.println("Base Shapes Visible: " + baseShapesVisible);
        System.out.println("Series Lines Visible: " + seriesLinesVisible);
        System.out.println("Draw Outlines: " + drawOutlines);
    }
}