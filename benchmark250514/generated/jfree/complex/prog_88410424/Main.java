import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new StandardXYItemRenderer();
        Map<Integer, Paint> seriesPaints = new HashMap<>();

        // Set up some initial series paints
        seriesPaints.put(1, Color.BLUE);
        seriesPaints.put(2, Color.GREEN);
        
        for (Map.Entry<Integer, Paint> entry : seriesPaints.entrySet()) {
            renderer.setSeriesPaint(entry.getKey(), entry.getValue());
        }

        // Add a new series paint
        /* write */ renderer.setSeriesPaint(0, Color.RED);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More unrelated logic
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'e'; c++) {
            sb.append(c);
        }
        System.out.println("Concatenated string: " + sb.toString());

        // Retrieve the paint for the series
        /* read */ Paint paint = renderer.getSeriesPaint(0);
        System.out.println("Series 0 paint: " + paint);

        // Additional unrelated logic
        for (Map.Entry<Integer, Paint> entry : seriesPaints.entrySet()) {
            System.out.println("Series " + entry.getKey() + " paint: " + entry.getValue());
        }
    }
}