import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        
        // Setting a fill paint for series index 0
        Paint fillPaint = Color.RED;
        /* write */ renderer.setSeriesFillPaint(0, fillPaint);
        
        // Create a HashMap to store series index and their colors
        HashMap<Integer, Paint> seriesPaintMap = new HashMap<>();
        seriesPaintMap.put(1, Color.BLUE);
        seriesPaintMap.put(2, Color.GREEN);
        
        // Apply additional paints to different series
        for (Integer index : seriesPaintMap.keySet()) {
            renderer.setSeriesFillPaint(index, seriesPaintMap.get(index));
        }
        
        // Perform unrelated operations to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Retrieving the fill paint for series index 0
        /* read */ Paint retrievedFillPaint = renderer.getSeriesFillPaint(0);
        
        System.out.println("Fill paint set and retrieved for series 0: " + retrievedFillPaint);
        
        // Print all series paints
        for (int i = 0; i <= 2; i++) {
            Paint paint = renderer.getSeriesFillPaint(i);
            System.out.println("Series " + i + " paint: " + paint);
        }
    }
}