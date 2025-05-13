import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Paint paint = Color.BLUE;
        Paint anotherPaint = Color.RED;

        // Initialize a map to store different Paint objects
        Map<String, Paint> paintMap = new HashMap<>();
        paintMap.put("default", paint);
        paintMap.put("alternative", anotherPaint);

        // Set label background paint using the map
        /* write */ plot.setLabelBackgroundPaint(paintMap.get("default"));

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Change the paint in the map
        paintMap.put("default", paintMap.get("alternative"));

        // Retrieve the label background paint
        /* read */ Paint readPaint = plot.getLabelBackgroundPaint();
        System.out.println("Label Background Paint: " + readPaint);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Use the paint in another context
        Paint currentPaint = paintMap.get("alternative");
        System.out.println("Current Paint from Map: " + currentPaint);
    }
}