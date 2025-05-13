import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Define the series index and paint color
        int seriesIndex = 0;
        Paint paintColor = Color.RED;
        
        /* write */ renderer.setSeriesOutlinePaint(seriesIndex, paintColor);
        
        // Additional complex logic
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.BLUE);
        paintList.add(Color.GREEN);
        
        // Simulate setting paints for multiple series
        for (int i = 0; i < paintList.size(); i++) {
            renderer.setSeriesOutlinePaint(i + 1, paintList.get(i));
        }
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Retrieve the paint for the original series index
        /* read */ Paint retrievedPaint = renderer.getSeriesOutlinePaint(seriesIndex);
        
        System.out.println("Retrieved Paint for series index " + seriesIndex + ": " + retrievedPaint);
        
        // More unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
        
        // Print all paints for visualization
        for (int i = 0; i <= paintList.size(); i++) {
            Paint p = renderer.getSeriesOutlinePaint(i);
            System.out.println("Series " + i + " Paint: " + p);
        }
    }
}