import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        // Initialize the paint color for setting negative paint
        Color negativePaintColor = Color.RED;
        
        /* write */ renderer.setNegativePaint(negativePaintColor);
        
        /* read */ Color readNegativePaint = (Color) renderer.getNegativePaint();
        
        // Print the read negative paint color to verify
        System.out.println(readNegativePaint);
    }
}