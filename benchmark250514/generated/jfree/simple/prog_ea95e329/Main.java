import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        
        // Initialize a Paint object to use with the setShadowPaint method
        Paint shadowPaint = Color.GRAY;
        
        /* write */ piePlot.setShadowPaint(shadowPaint);
        
        /* read */ Paint retrievedShadowPaint = piePlot.getShadowPaint();
        
        // Print the result to verify the read value matches the written value
        System.out.println(retrievedShadowPaint);
    }
}