import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Paint paint = Color.RED;
        
        /* write */ renderer.setRangePaint(paint);
        /* read */ Paint retrievedPaint = renderer.getRangePaint();
        
        if (retrievedPaint.equals(paint)) {
            System.out.println("The read method successfully retrieved the value set by the write method.");
        } else {
            System.out.println("The read method did not retrieve the correct value.");
        }
    }
}