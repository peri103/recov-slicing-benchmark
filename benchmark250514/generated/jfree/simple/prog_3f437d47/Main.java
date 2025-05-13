import org.jfree.chart.renderer.xy.XYItemRenderer;
import java.awt.Color;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new StandardXYItemRenderer();
        /* write */ renderer.setSeriesPaint(0, Color.RED);
        /* read */ java.awt.Paint paint = renderer.getSeriesPaint(0);
        System.out.println(paint);
    }
}