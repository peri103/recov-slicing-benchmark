import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the BarRenderer and LineAndShapeRenderer
        BarRenderer barRenderer = new BarRenderer();
        LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
        
        // Create a HashMap to store color mappings
        Map<Integer, Color> colorMap = new HashMap<>();
        colorMap.put(0, Color.RED);
        colorMap.put(1, Color.BLUE);
        colorMap.put(2, Color.GREEN);
        
        // Set series outline paints for BarRenderer using the color map
        for (Map.Entry<Integer, Color> entry : colorMap.entrySet()) {
            barRenderer.setSeriesOutlinePaint(entry.getKey(), entry.getValue());
        }
        
        // Add some unrelated complex logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Set series paint for LineAndShapeRenderer
        lineRenderer.setSeriesPaint(0, Color.YELLOW);
        lineRenderer.setSeriesPaint(1, Color.CYAN);
        
        // Retrieve and print series outline paint from BarRenderer
        /* read */ Paint paint = barRenderer.getSeriesOutlinePaint(0);
        System.out.println("Series 0 outline paint: " + paint);
        
        // Additional logic to manipulate LineAndShapeRenderer
        Paint linePaint = lineRenderer.getSeriesPaint(0);
        System.out.println("Line series 0 paint: " + linePaint);
        
        // Further unrelated code
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
        
        // Complex operation using the color map
        for (Integer key : colorMap.keySet()) {
            System.out.println("Color for series " + key + ": " + colorMap.get(key));
        }
    }
}