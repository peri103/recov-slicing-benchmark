import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        ChartRenderer renderer1 = new ChartRenderer();
        ChartRenderer renderer2 = new ChartRenderer();
        
        RendererManager manager = new RendererManager();
        manager.addRenderer(renderer1);
        manager.addRenderer(renderer2);

        renderer1.setPositivePaint(new Color(0, 255, 0)); // Set green color
        renderer2.setPositivePaint(new Color(255, 0, 0)); // Set red color

        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        // Retrieve positive paint from the first renderer
        /* read */ Paint positivePaint = manager.getRendererPositivePaint(0);
        System.out.println("Renderer 1 Positive Paint: " + positivePaint);

        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
    }
}