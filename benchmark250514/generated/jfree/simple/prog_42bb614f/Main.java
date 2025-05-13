import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYDifferenceRenderer object
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        // Create a Paint object to set as positive paint
        Paint positivePaint = Color.RED;
        
        /* write */ renderer.setPositivePaint(positivePaint);
        
        /* read */ Paint retrievedPaint = renderer.getPositivePaint();
        
        // Print the retrieved paint to verify it matches the set paint
        System.out.println(retrievedPaint);
    }
}