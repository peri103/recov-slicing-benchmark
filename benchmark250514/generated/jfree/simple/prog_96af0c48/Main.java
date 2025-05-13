import org.jfree.chart.plot.PolarPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PolarPlot polarPlot = new PolarPlot();
        
        // Create a Paint object to be used for the angle gridline
        Paint paint = Color.RED;
        
        /* write */ polarPlot.setAngleGridlinePaint(paint);
        
        /* read */ Paint retrievedPaint = polarPlot.getAngleGridlinePaint();
        
        System.out.println(retrievedPaint);
    }
}