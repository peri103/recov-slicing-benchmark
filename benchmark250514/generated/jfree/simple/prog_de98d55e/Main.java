import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        
        // Create a Color object to use as the shadow paint
        Paint shadowPaint = new Color(100, 100, 100); // Example color
        
        /* write */ plot.setLabelShadowPaint(shadowPaint);
        
        /* read */ Paint retrievedPaint = plot.getLabelShadowPaint();
        
        // Print out the retrieved paint to verify it matches the written paint
        System.out.println(retrievedPaint);
    }
}