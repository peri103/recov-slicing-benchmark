import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        Paint paint = new Color(255, 0, 0); // Red color
        /* write */ renderer.setSeriesFillPaint(0, paint);
        /* read */ Paint readPaint = renderer.getSeriesFillPaint(0);
        System.out.println(readPaint);
    }
}