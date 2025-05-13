import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYStepAreaRenderer
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Create a Paint object
        Paint paint = Color.RED;
        
        // Use the setRangePaint method to set the range paint
        /* write */ renderer.setRangePaint(paint);
        
        // Use the getRangePaint method to retrieve the range paint
        /* read */ Paint retrievedPaint = renderer.getRangePaint();
        
        // Print the result to verify
        System.out.println(retrievedPaint);
    }
}