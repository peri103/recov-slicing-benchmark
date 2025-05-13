import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot piePlot = new PiePlot();
        
        // Create a Color object to set as the label shadow paint
        Color shadowPaint = new Color(100, 100, 100); // Gray color
        
        /* write */ piePlot.setLabelShadowPaint(shadowPaint);
        
        /* read */ Color retrievedShadowPaint = (Color) piePlot.getLabelShadowPaint();
        
        // Print the retrieved color to verify it matches the one set
        System.out.println("Label Shadow Paint: " + retrievedShadowPaint);
    }
}