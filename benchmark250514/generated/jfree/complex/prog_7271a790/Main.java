import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BarRenderer renderer = new BarRenderer();
        Paint paint = Color.RED;
        
        // Create a map to store series colors
        Map<Integer, Paint> seriesPaintMap = new HashMap<>();
        seriesPaintMap.put(0, Color.BLUE);
        seriesPaintMap.put(1, Color.GREEN);
        seriesPaintMap.put(2, Color.YELLOW);

        // Set different outline paints for different series
        for (Map.Entry<Integer, Paint> entry : seriesPaintMap.entrySet()) {
            renderer.setSeriesOutlinePaint(entry.getKey(), entry.getValue());
        }

        // Set the original paint for the first series
        /* write */ renderer.setSeriesOutlinePaint(0, paint);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Retrieve and print the outline paint for the first series
        /* read */ Paint readPaint = renderer.getSeriesOutlinePaint(0);
        System.out.println("Series 0 Outline Paint: " + readPaint);
        
        // Further unrelated operations
        for (int i = 0; i < seriesPaintMap.size(); i++) {
            Paint currentPaint = renderer.getSeriesOutlinePaint(i);
            System.out.println("Series " + i + " Outline Paint: " + currentPaint);
        }
    }
}