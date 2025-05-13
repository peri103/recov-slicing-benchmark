import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        BarRenderer renderer = new BarRenderer();
        /* write */ renderer.setSeriesOutlinePaint(0, Color.RED);
        /* read */ Color outlinePaint = (Color) renderer.getSeriesOutlinePaint(0);
        System.out.println(outlinePaint);
    }
}