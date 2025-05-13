import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYStepAreaRenderer object
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Create a stroke object to set as the outline stroke
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ renderer.setOutlineStroke(stroke);
        
        /* read */ Stroke readStroke = renderer.getOutlineStroke();
        
        // Print out the stroke object to verify it was set correctly
        System.out.println(readStroke);
    }
}