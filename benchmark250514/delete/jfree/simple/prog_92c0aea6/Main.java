import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Paint;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Paint paint = Color.RED;
        /* write */ renderer.setDomainPaint(paint);
        /* read */ Paint retrievedPaint = renderer.getDomainPaint();
        System.out.println(retrievedPaint);
    }
}