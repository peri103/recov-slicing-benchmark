import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        
        // Initialize the Paint object for shadow
        Paint shadowPaint = Color.GRAY;
        
        /* write */ plot.setShadowPaint(shadowPaint);
        /* read */ Paint retrievedShadowPaint = plot.getShadowPaint();
        
        System.out.println(retrievedShadowPaint);
    }
}