import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Setting the outline paint for series index 0
        Paint paint = Color.RED;
        /* write */ renderer.setSeriesOutlinePaint(0, paint);
        
        // Retrieving the outline paint for series index 0
        /* read */ Paint retrievedPaint = renderer.getSeriesOutlinePaint(0);
        
        // Print the result to verify
        System.out.println(retrievedPaint);
    }
}