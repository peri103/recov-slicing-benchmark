import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Initialize a stroke to use for the outline
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ renderer.setSeriesOutlineStroke(0, stroke);
        
        /* read */ Stroke retrievedStroke = renderer.getSeriesOutlineStroke(0);
        
        // Print the result to verify
        System.out.println(retrievedStroke.equals(stroke));
    }
}