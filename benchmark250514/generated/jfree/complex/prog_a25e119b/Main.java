import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYStepAreaRenderer object
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();

        // Define a series index and a color
        int seriesIndex = 0;
        Color paintColor = Color.RED;

        // Initialize a HashMap to store series index and corresponding paint colors
        HashMap<Integer, Paint> seriesPaintMap = new HashMap<>();

        // Write operation: Set the paint color for the series
        /* write */ renderer.setSeriesPaint(seriesIndex, paintColor);

        // Add the paint color to the HashMap
        seriesPaintMap.put(seriesIndex, paintColor);

        // Perform some unrelated operations
        for (int i = 1; i <= 3; i++) {
            Color color = new Color(50 * i, 100 * i, 150 * i);
            renderer.setSeriesPaint(i, color);
            seriesPaintMap.put(i, color);
        }

        // Process the HashMap to print series and their colors
        for (Integer key : seriesPaintMap.keySet()) {
            System.out.println("Series " + key + " has color: " + seriesPaintMap.get(key));
        }

        // Read operation: Retrieve the paint color for the series
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(seriesIndex);

        // Print the retrieved paint color to ensure it matches the written value
        System.out.println("Retrieved paint color for series " + seriesIndex + ": " + retrievedPaint);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers is: " + sum);
    }
}