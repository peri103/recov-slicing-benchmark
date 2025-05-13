import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of XYAreaRenderer
        XYAreaRenderer renderer = new XYAreaRenderer();

        // Define a paint color
        Paint fillPaint = Color.BLUE;

        // Set the series fill paint for series index 0
        /* write */ renderer.setSeriesFillPaint(0, fillPaint);

        // Additional unrelated logic to add complexity
        Map<Integer, String> seriesNames = new HashMap<>();
        seriesNames.put(0, "Series A");
        seriesNames.put(1, "Series B");

        // Set another series paint without marking it
        Paint anotherPaint = Color.RED;
        renderer.setSeriesFillPaint(1, anotherPaint);

        // Perform some operations on the map
        for (Map.Entry<Integer, String> entry : seriesNames.entrySet()) {
            System.out.println("Series Index: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Perform a calculation
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Retrieve the series fill paint for series index 0
        /* read */ Paint retrievedPaint = renderer.getSeriesFillPaint(0);

        // Print the result to verify
        System.out.println("Retrieved Paint: " + retrievedPaint);

        // More unrelated code
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 numbers: " + product);
    }
}