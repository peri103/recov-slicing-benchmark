import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        Stroke stroke = new BasicStroke(2.0f); // Create a stroke with a width of 2.0
        /* write */ renderer.setSeriesOutlineStroke(0, stroke);
        
        /* read */ Stroke readStroke = renderer.getSeriesOutlineStroke(0);
        System.out.println(readStroke);
    }
}