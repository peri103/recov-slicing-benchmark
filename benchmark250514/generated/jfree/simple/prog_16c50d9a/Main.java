import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        /* write */ renderer.setSeriesFillPaint(0, Color.BLUE);
        /* read */ Paint paint = renderer.getSeriesFillPaint(0);
        System.out.println(paint);
    }
}