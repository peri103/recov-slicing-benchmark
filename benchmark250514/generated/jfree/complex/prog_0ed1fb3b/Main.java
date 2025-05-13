import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a renderer
        XYItemRenderer renderer = new StandardXYItemRenderer();
        
        // Define the series index and the paint color
        int seriesIndex = 0;
        Color paintColor = Color.RED;
        
        // Another renderer for demonstration purposes
        XYItemRenderer anotherRenderer = new StandardXYItemRenderer();
        
        // Define another series index and paint color
        int anotherSeriesIndex = 1;
        Color anotherPaintColor = Color.BLUE;
        
        // Set paint for another renderer
        anotherRenderer.setSeriesPaint(anotherSeriesIndex, anotherPaintColor);
        
        // Create a list to store Paint objects
        ArrayList<Paint> paintList = new ArrayList<>();
        
        // Populate the list with paints
        paintList.add(Color.GREEN);
        paintList.add(Color.YELLOW);
        paintList.add(Color.ORANGE);
        
        // Iterate over the list and set paints for the renderer
        for (int i = 0; i < paintList.size(); i++) {
            renderer.setSeriesPaint(i + 2, paintList.get(i));
        }
        
        /* write */ renderer.setSeriesPaint(seriesIndex, paintColor);
        
        // Retrieve and print paint from anotherRenderer
        Paint anotherRetrievedPaint = anotherRenderer.getSeriesPaint(anotherSeriesIndex);
        System.out.println("Another Renderer Paint: " + anotherRetrievedPaint);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // More unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Print the numbers
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
        
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(seriesIndex);
        
        // Output the paint color to verify
        System.out.println("Retrieved Paint: " + retrievedPaint);
    }
}