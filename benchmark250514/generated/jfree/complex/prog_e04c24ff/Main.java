import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        
        // Create a map to store series outline paints
        Map<Integer, Paint> seriesPaints = new HashMap<>();
        
        // Add some paints to the map
        seriesPaints.put(1, Color.BLUE);
        seriesPaints.put(2, Color.GREEN);
        
        // Set series outline paint for index 0
        /* write */ plot.setSeriesOutlinePaint(0, Color.RED);
        
        // Use the map to set other series outline paints
        for (Map.Entry<Integer, Paint> entry : seriesPaints.entrySet()) {
            plot.setSeriesOutlinePaint(entry.getKey(), entry.getValue());
        }
        
        // Perform some unrelated calculations
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i * i;
        }
        System.out.println("Calculation result: " + result);
        
        // Retrieve and print series outline paints from the map
        for (int i = 1; i <= 2; i++) {
            Paint paint = plot.getSeriesOutlinePaint(i);
            System.out.println("Series " + i + " paint: " + paint);
        }
        
        // Retrieve the paint set for index 0
        /* read */ Paint paint = plot.getSeriesOutlinePaint(0);
        
        System.out.println("Series 0 paint: " + paint);
        
        // Further unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);
    }
}