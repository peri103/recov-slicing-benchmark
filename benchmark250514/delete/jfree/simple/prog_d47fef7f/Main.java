import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Paint paint = new Color(255, 0, 0); // Red color

        /* write */ renderer.setRangePaint(paint);
        /* read */ Paint retrievedPaint = renderer.getRangePaint();

        System.out.println(retrievedPaint);
    }
}