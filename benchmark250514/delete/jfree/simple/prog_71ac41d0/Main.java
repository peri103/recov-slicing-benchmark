import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new StandardXYItemRenderer();
        /* write */ renderer.setBaseShapesVisible(true);
        /* read */ boolean isVisible = renderer.getBaseShapesVisible();
        System.out.println(isVisible);
    }
}