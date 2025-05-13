import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new StandardXYItemRenderer();
        HashMap<Integer, Stroke> strokeMap = new HashMap<>();
        
        // Set series paint for series 0
        /* write */ renderer.setSeriesPaint(0, Color.RED);

        // Set series paint for series 1 and 2
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesPaint(2, Color.GREEN);

        // Add strokes to a map
        strokeMap.put(0, new BasicStroke(1.0f));
        strokeMap.put(1, new BasicStroke(2.0f));
        strokeMap.put(2, new BasicStroke(3.0f));

        // Set strokes for series
        for (int i = 0; i < 3; i++) {
            renderer.setSeriesStroke(i, strokeMap.get(i));
        }
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 9: " + sum);

        // Retrieve and print the series paint for series 0
        /* read */ Color color = (Color) renderer.getSeriesPaint(0);
        System.out.println("Color of series 0: " + color);

        // Retrieve and print the strokes for all series
        for (int i = 0; i < 3; i++) {
            Stroke stroke = renderer.getSeriesStroke(i);
            System.out.println("Stroke of series " + i + ": " + stroke);
        }
    }
}