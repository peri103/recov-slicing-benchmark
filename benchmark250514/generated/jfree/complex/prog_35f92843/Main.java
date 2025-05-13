import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        Paint positivePaint = new Color(0, 255, 0); // Green color

        // Create a list to store renderer configurations
        ArrayList<XYDifferenceRenderer> rendererList = new ArrayList<>();
        rendererList.add(renderer);

        // Set the positive paint for the renderer
        /* write */ renderer.setPositivePaint(positivePaint);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Create another renderer and configure it
        XYDifferenceRenderer anotherRenderer = new XYDifferenceRenderer();
        anotherRenderer.setPositivePaint(new Color(255, 0, 0)); // Red color
        rendererList.add(anotherRenderer);

        // Iterate over the renderer list and print their positive paint
        for (XYDifferenceRenderer r : rendererList) {
            Paint paint = r.getPositivePaint();
            System.out.println("Renderer Positive Paint: " + paint);
        }

        // Read the positive paint from the original renderer
        /* read */ Paint readPositivePaint = renderer.getPositivePaint();
        
        System.out.println("Original Renderer Positive Paint: " + readPositivePaint);

        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}