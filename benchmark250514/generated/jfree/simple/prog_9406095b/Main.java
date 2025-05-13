import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new StandardXYItemRenderer();
        /* write */ renderer.setSeriesPaint(0, Color.RED);
        /* read */ Color color = (Color) renderer.getSeriesPaint(0);
        System.out.println(color);
    }
}