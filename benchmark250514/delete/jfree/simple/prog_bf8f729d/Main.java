import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Create a Paint object to use with the write method
        Paint paint = Color.RED;
        
        /* write */ renderer.setDomainPaint(paint);
        
        /* read */ Paint retrievedPaint = renderer.getDomainPaint();
        
        // Print the retrieved paint object to verify it matches the written value
        System.out.println(retrievedPaint);
    }
}