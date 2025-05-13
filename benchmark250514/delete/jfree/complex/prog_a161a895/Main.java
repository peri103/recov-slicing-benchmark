import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;
import org.jfree.chart.renderer.category.LineRenderer3D;

public class Main {
    public static void main(String[] args) {
        BarRenderer barRenderer = new BarRenderer();
        LineRenderer3D lineRenderer = new LineRenderer3D();
        
        // Set the outline paint for the series at index 0 in BarRenderer
        /* write */ barRenderer.setSeriesOutlinePaint(0, Color.RED);
        
        // Perform some unrelated operations using LineRenderer3D
        lineRenderer.setSeriesPaint(0, Color.BLUE);
        lineRenderer.setSeriesPaint(1, Color.GREEN);
        
        // Manipulate the BarRenderer with additional series
        barRenderer.setSeriesOutlinePaint(1, Color.YELLOW);
        barRenderer.setSeriesOutlinePaint(2, Color.BLACK);
        
        // Perform some calculations and transformations
        int[] data = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("Sum of data: " + sum);

        // Further unrelated operations
        double average = sum / (double) data.length;
        System.out.println("Average: " + average);

        // Read the outline paint for the series at index 0 in BarRenderer
        /* read */ Color outlinePaint = (Color) barRenderer.getSeriesOutlinePaint(0);
        
        // Print the color to verify
        System.out.println("Outline Paint for Series 0: " + outlinePaint);
        
        // More operations on BarRenderer
        barRenderer.setSeriesOutlinePaint(3, Color.ORANGE);
        barRenderer.setSeriesOutlinePaint(4, Color.PINK);
        
        // Print all series outline paints
        for (int i = 0; i < 5; i++) {
            System.out.println("Series " + i + " Outline Paint: " + barRenderer.getSeriesOutlinePaint(i));
        }
    }
}