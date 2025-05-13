import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        Paint paint = Color.RED;
        
        // Initialize a map to store series index and their respective colors
        Map<Integer, Paint> seriesColorMap = new HashMap<>();
        
        // Adding multiple series with different colors
        seriesColorMap.put(0, Color.RED);
        seriesColorMap.put(1, Color.BLUE);
        seriesColorMap.put(2, Color.GREEN);

        // Set colors for each series in the renderer
        for (Map.Entry<Integer, Paint> entry : seriesColorMap.entrySet()) {
            renderer.setSeriesPaint(entry.getKey(), entry.getValue());
        }
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Modify a series color
        /* write */ renderer.setSeriesPaint(0, paint);
        
        // Perform more unrelated operations
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println(sb.toString());
        
        // Retrieve and print the color of the first series
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(0);
        System.out.println("Retrieved Paint: " + retrievedPaint);
        
        // Print all series colors
        for (int i = 0; i < seriesColorMap.size(); i++) {
            Paint seriesPaint = renderer.getSeriesPaint(i);
            System.out.println("Series " + i + " Paint: " + seriesPaint);
        }
    }
}