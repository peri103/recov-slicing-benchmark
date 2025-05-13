import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYDifferenceRenderer
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        // Create a Paint object to set as negative paint
        Paint negativePaint = Color.RED;
        
        /* write */ renderer.setNegativePaint(negativePaint);
        
        /* read */ Paint retrievedNegativePaint = renderer.getNegativePaint();
        
        // Print the retrieved negative paint to verify the read operation
        System.out.println(retrievedNegativePaint);
    }
}