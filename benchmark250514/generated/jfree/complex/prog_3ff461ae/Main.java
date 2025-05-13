import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store series index and their corresponding colors
        HashMap<Integer, Paint> seriesPaintMap = new HashMap<>();
        seriesPaintMap.put(0, new Color(255, 0, 0)); // Red color
        seriesPaintMap.put(1, new Color(0, 255, 0)); // Green color
        seriesPaintMap.put(2, new Color(0, 0, 255)); // Blue color
        
        // Create a StackedXYAreaRenderer instance
        StackedXYAreaRenderer renderer = new StackedXYAreaRenderer();
        
        // Set series paint for multiple series
        for (Integer seriesIndex : seriesPaintMap.keySet()) {
            renderer.setSeriesPaint(seriesIndex, seriesPaintMap.get(seriesIndex));
        }
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        // More unrelated operations
        String[] words = {"Hello", "World", "Java", "Programming"};
        for (String word : words) {
            System.out.println(word);
        }
        
        // Retrieve and print series paint for series index 0
        /* write */ renderer.setSeriesPaint(0, seriesPaintMap.get(0));
        
        // Perform unrelated operations before reading the paint
        double average = sum / 10.0;
        System.out.println("Average: " + average);
        
        // Read the series paint
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(0);
        System.out.println("Retrieved Paint for series 0: " + retrievedPaint);
        
        // Continue with unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 natural numbers: " + product);
    }
}