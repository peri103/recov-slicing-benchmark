import org.jfree.chart.renderer.xy.XYItemRenderer;
import java.awt.Color;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the renderer object
        XYItemRenderer renderer = new StandardXYItemRenderer();
        
        // Define the series index and the paint color
        int seriesIndex = 0;
        Color paintColor = Color.RED;
        
        /* write */ renderer.setSeriesPaint(seriesIndex, paintColor);
        
        /* read */ Color retrievedColor = (Color) renderer.getSeriesPaint(seriesIndex);
        
        // Print the color to verify the read operation
        System.out.println(retrievedColor);
    }
}