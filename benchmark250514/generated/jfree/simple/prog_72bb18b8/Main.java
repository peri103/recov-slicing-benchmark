import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        StackedXYAreaRenderer renderer = new StackedXYAreaRenderer();
        
        // Set a paint (color) for a series
        int seriesIndex = 0;
        Paint paint = Color.BLUE;
        /* write */ renderer.setSeriesPaint(seriesIndex, paint);
        
        // Retrieve the paint (color) for the series
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(seriesIndex);
        
        // Print out the color to verify
        System.out.println(retrievedPaint);
    }
}