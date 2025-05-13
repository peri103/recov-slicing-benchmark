import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYDifferenceRenderer
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();

        // Create a Paint object for positive values
        Paint positivePaint = new Color(255, 0, 0); // Red color

        // Create a Paint object for negative values
        Paint negativePaint = new Color(0, 0, 255); // Blue color

        // Create a HashMap to store some additional data
        HashMap<String, Paint> paintMap = new HashMap<>();

        // Add the Paint objects to the HashMap
        paintMap.put("positive", positivePaint);
        paintMap.put("negative", negativePaint);

        // Set the positive and negative paints in the renderer
        /* write */ renderer.setPositivePaint(paintMap.get("positive"));
        renderer.setNegativePaint(paintMap.get("negative"));

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Access the positive paint from the renderer
        /* read */ Paint readPaint = renderer.getPositivePaint();
        
        // Print the positive paint
        System.out.println("Positive Paint: " + readPaint);

        // Perform some additional operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        // Access the negative paint from the renderer
        Paint readNegativePaint = renderer.getNegativePaint();
        System.out.println("Negative Paint: " + readNegativePaint);
    }
}