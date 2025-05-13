import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Paint rangePaint = new Color(255, 0, 0); // Red color

        // Initialize a map to store different colors
        Map<String, Paint> paintMap = new HashMap<>();
        paintMap.put("Red", new Color(255, 0, 0));
        paintMap.put("Green", new Color(0, 255, 0));
        paintMap.put("Blue", new Color(0, 0, 255));

        // Set range paint using the map
        Paint selectedPaint = paintMap.get("Red");
        /* write */ renderer.setRangePaint(selectedPaint);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use the renderer to get the range paint
        /* read */ Paint readPaint = renderer.getRangePaint();
        System.out.println("Range Paint: " + readPaint);

        // Use the map to change the paint again
        selectedPaint = paintMap.get("Blue");
        renderer.setRangePaint(selectedPaint);

        // Print all colors in the map
        for (Map.Entry<String, Paint> entry : paintMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}