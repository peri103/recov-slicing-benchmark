import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Set the outline paint for series 0
        /* write */ renderer.setSeriesOutlinePaint(0, Color.RED);
        
        // Retrieve the outline paint for series 0
        /* read */ Paint outlinePaint = renderer.getSeriesOutlinePaint(0);
        
        System.out.println(outlinePaint);
    }
}