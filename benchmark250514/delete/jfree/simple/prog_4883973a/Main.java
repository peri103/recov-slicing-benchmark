import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Paint rangePaint = new Color(255, 0, 0); // Red color

        /* write */ renderer.setRangePaint(rangePaint);
        /* read */ Paint readPaint = renderer.getRangePaint();

        System.out.println(readPaint);
    }
}