import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        int seriesIndex = 0;
        Paint fillPaint = Color.RED;
        
        /* write */ renderer.setSeriesFillPaint(seriesIndex, fillPaint);

        // Additional unrelated code to make the program more complex
        Map<Integer, Paint> paintMap = new HashMap<>();
        paintMap.put(seriesIndex, fillPaint);

        for (Map.Entry<Integer, Paint> entry : paintMap.entrySet()) {
            System.out.println("Series Index: " + entry.getKey() + ", Paint: " + entry.getValue());
        }

        // Using similar API methods without marking them
        Paint anotherPaint = Color.BLUE;
        int anotherSeriesIndex = 1;
        renderer.setSeriesFillPaint(anotherSeriesIndex, anotherPaint);

        Paint retrievedAnotherPaint = renderer.getSeriesFillPaint(anotherSeriesIndex);
        System.out.println("Another Paint Retrieved: " + retrievedAnotherPaint);

        // Further unrelated code
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        /* read */ Paint retrievedFillPaint = renderer.getSeriesFillPaint(seriesIndex);
        System.out.println("Retrieved Fill Paint: " + retrievedFillPaint);
    }
}