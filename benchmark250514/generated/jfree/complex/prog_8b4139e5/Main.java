import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        Paint paint = new Color(255, 0, 0); // Red color

        // Initialize a list of renderers for demonstration
        List<XYAreaRenderer> rendererList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            XYAreaRenderer tempRenderer = new XYAreaRenderer();
            tempRenderer.setSeriesFillPaint(i, new Color(0, 0, 255)); // Blue color
            rendererList.add(tempRenderer);
        }

        /* write */ renderer.setSeriesFillPaint(0, paint);

        // Perform some operations on the list of renderers
        for (XYAreaRenderer tempRenderer : rendererList) {
            Paint tempPaint = tempRenderer.getSeriesFillPaint(0);
            System.out.println("Renderer paint: " + tempPaint);
        }

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // More complex operations with the list
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        /* read */ Paint retrievedPaint = renderer.getSeriesFillPaint(0);
        System.out.println("Retrieved Paint: " + retrievedPaint);
    }
}