import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        
        // Create a Color object to use as the shadow paint
        Paint shadowPaint = new Color(100, 100, 100); // Gray color
        
        /* write */ piePlot.setLabelShadowPaint(shadowPaint);
        /* read */ Paint readShadowPaint = piePlot.getLabelShadowPaint();
        
        // Print the result to verify the read method retrieves the value set by the write method
        System.out.println(readShadowPaint);
    }
}