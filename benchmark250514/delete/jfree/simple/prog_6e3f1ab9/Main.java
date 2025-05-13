import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Paint paint = Color.BLUE;
        /* write */ renderer.setDomainPaint(paint);
        /* read */ Paint readPaint = renderer.getDomainPaint();
        System.out.println(readPaint);
    }
}