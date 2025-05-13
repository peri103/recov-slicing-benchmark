import org.jfree.chart.renderer.AbstractRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        AbstractRenderer renderer = new AbstractRenderer();
        /* write */ renderer.setSeriesPaint(0, Color.RED);
        /* read */ Paint paint = renderer.getSeriesPaint(0);
        System.out.println(paint);
    }
}