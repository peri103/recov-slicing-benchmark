import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        BarRenderer renderer = new BarRenderer();
        
        // Set the outline paint for the series at index 0
        /* write */ renderer.setSeriesOutlinePaint(0, Color.RED);
        
        // Read the outline paint for the series at index 0
        /* read */ Color outlinePaint = (Color) renderer.getSeriesOutlinePaint(0);
        
        // Print the color to verify
        System.out.println(outlinePaint);
    }
}