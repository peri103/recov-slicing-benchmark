import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Initialize the paint object
        Color paint = Color.BLUE;
        
        // Write operation: set the paint for a series
        /* write */ renderer.setSeriesPaint(0, paint);
        
        // Read operation: get the paint for the series
        /* read */ Color retrievedPaint = (Color) renderer.getSeriesPaint(0);
        
        // Output the result to verify the operations
        System.out.println(retrievedPaint);
    }
}