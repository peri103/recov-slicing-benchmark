import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Initialize a Paint object, for example using Color
        Paint paint = Color.RED;
        
        /* write */ renderer.setRangePaint(paint);
        
        /* read */ Paint readPaint = renderer.getRangePaint();
        
        System.out.println(readPaint);
    }
}