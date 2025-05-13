import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        
        // Create a Paint object to use for the label shadow
        Paint shadowPaint = new Color(100, 100, 100); // Grey color
        
        /* write */ plot.setLabelShadowPaint(shadowPaint);
        
        /* read */ Paint readShadowPaint = plot.getLabelShadowPaint();
        
        System.out.println(readShadowPaint);
    }
}