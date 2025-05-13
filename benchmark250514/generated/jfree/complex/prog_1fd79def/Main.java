import org.jfree.chart.renderer.xy.XYBarRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XYBarRenderer renderer = new XYBarRenderer();
        int seriesIndex = 0;
        Paint outlinePaint = Color.RED;
        
        // Initialize a map to store series paints
        Map<Integer, Paint> seriesPaints = new HashMap<>();
        seriesPaints.put(1, Color.BLUE);
        seriesPaints.put(2, Color.GREEN);

        // Set paint for other series
        for (Map.Entry<Integer, Paint> entry : seriesPaints.entrySet()) {
            renderer.setSeriesOutlinePaint(entry.getKey(), entry.getValue());
        }

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* write */ renderer.setSeriesOutlinePaint(seriesIndex, outlinePaint);

        // Another unrelated map operation
        Map<String, Integer> stringLengths = new HashMap<>();
        stringLengths.put("apple", 5);
        stringLengths.put("banana", 6);
        stringLengths.put("cherry", 6);

        int totalLength = 0;
        for (int length : stringLengths.values()) {
            totalLength += length;
        }
        System.out.println("Total length of strings: " + totalLength);

        // Retrieve and print the paint for the original series
        /* read */ Paint readOutlinePaint = renderer.getSeriesOutlinePaint(seriesIndex);
        System.out.println("Outline paint for series 0: " + readOutlinePaint);

        // Check the paint for other series
        for (Map.Entry<Integer, Paint> entry : seriesPaints.entrySet()) {
            Paint paint = renderer.getSeriesOutlinePaint(entry.getKey());
            System.out.println("Outline paint for series " + entry.getKey() + ": " + paint);
        }
    }
}