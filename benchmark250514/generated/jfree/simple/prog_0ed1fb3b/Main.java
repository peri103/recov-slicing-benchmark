import org.jfree.chart.renderer.xy.XYItemRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Assuming we have a concrete implementation of XYItemRenderer
        XYItemRenderer renderer = new org.jfree.chart.renderer.xy.StandardXYItemRenderer();
        
        // Define the series index and the paint color
        int seriesIndex = 0;
        Color paintColor = Color.RED;
        
        /* write */ renderer.setSeriesPaint(seriesIndex, paintColor);
        
        /* read */ java.awt.Paint retrievedPaint = renderer.getSeriesPaint(seriesIndex);
        
        // Output the paint color to verify
        System.out.println(retrievedPaint);
    }
}