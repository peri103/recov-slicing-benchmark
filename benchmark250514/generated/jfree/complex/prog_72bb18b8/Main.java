import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the renderer
        StackedXYAreaRenderer renderer = new StackedXYAreaRenderer();
        
        // Initialize a map to store series index and their corresponding colors
        Map<Integer, Paint> seriesPaintMap = new HashMap<>();
        
        // Set a paint (color) for a series
        int seriesIndex = 0;
        Paint paint = Color.BLUE;
        /* write */ renderer.setSeriesPaint(seriesIndex, paint);
        
        // Add more series with different colors
        seriesPaintMap.put(seriesIndex, paint);
        seriesIndex = 1;
        paint = Color.RED;
        renderer.setSeriesPaint(seriesIndex, paint);
        seriesPaintMap.put(seriesIndex, paint);
        
        seriesIndex = 2;
        paint = Color.GREEN;
        renderer.setSeriesPaint(seriesIndex, paint);
        seriesPaintMap.put(seriesIndex, paint);
        
        // Perform some operations on the map
        for (Map.Entry<Integer, Paint> entry : seriesPaintMap.entrySet()) {
            System.out.println("Series " + entry.getKey() + " has color: " + entry.getValue());
        }
        
        // Create a list to store series indices
        ArrayList<Integer> seriesIndices = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            seriesIndices.add(i);
        }
        
        // Retrieve the paint (color) for the first series
        int firstSeriesIndex = seriesIndices.get(0);
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(firstSeriesIndex);
        
        // Print out the color to verify
        System.out.println("Retrieved color for series " + firstSeriesIndex + ": " + retrievedPaint);
        
        // Iterate over the list and print colors
        for (int index : seriesIndices) {
            Paint currentPaint = renderer.getSeriesPaint(index);
            System.out.println("Color for series " + index + ": " + currentPaint);
        }
    }
}