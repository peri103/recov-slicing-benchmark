import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        Paint paint = Color.RED;
        
        // Define a map to store multiple series paints
        Map<Integer, Paint> seriesPaints = new HashMap<>();
        seriesPaints.put(0, Color.BLUE);
        seriesPaints.put(1, Color.GREEN);
        seriesPaints.put(2, Color.ORANGE);

        // Set paints for multiple series
        for (Map.Entry<Integer, Paint> entry : seriesPaints.entrySet()) {
            plot.setSeriesOutlinePaint(entry.getKey(), entry.getValue());
        }

        // Set the original paint
        /* write */ plot.setSeriesOutlinePaint(3, paint);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the paint for series 1
        Paint paintSeries1 = plot.getSeriesOutlinePaint(1);
        System.out.println("Paint for series 1: " + paintSeries1);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Finally, read the paint for series 3
        /* read */ Paint readPaint = plot.getSeriesOutlinePaint(3);
        
        System.out.println("Paint for series 3: " + readPaint);
    }
}