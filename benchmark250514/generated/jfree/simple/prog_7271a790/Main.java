import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        BarRenderer renderer = new BarRenderer();
        Paint paint = Color.RED;
        /* write */ renderer.setSeriesOutlinePaint(0, paint);
        /* read */ Paint readPaint = renderer.getSeriesOutlinePaint(0);
        System.out.println(readPaint);
    }
}