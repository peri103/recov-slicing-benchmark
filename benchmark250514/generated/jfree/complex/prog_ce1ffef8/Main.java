import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        
        // Set the fill paint for the series
        Paint fillPaint = Color.RED;
        /* write */ renderer.setSeriesFillPaint(0, fillPaint);
        
        // Additional operations to make the program more complex
        Map<Integer, Paint> paintMap = new HashMap<>();
        paintMap.put(1, Color.BLUE);
        paintMap.put(2, Color.GREEN);
        
        for (Map.Entry<Integer, Paint> entry : paintMap.entrySet()) {
            renderer.setSeriesFillPaint(entry.getKey(), entry.getValue());
        }
        
        // Perform some complex calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        
        // Retrieve the fill paint for the series
        /* read */ Paint retrievedPaint = renderer.getSeriesFillPaint(0);
        
        System.out.println("Retrieved paint for series 0: " + retrievedPaint);
        
        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
        
        // Check and print all paints set in the renderer
        for (int i = 0; i <= 2; i++) {
            System.out.println("Paint for series " + i + ": " + renderer.getSeriesFillPaint(i));
        }
    }
}