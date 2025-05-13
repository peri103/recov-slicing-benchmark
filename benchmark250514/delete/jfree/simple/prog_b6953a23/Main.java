import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYItemRenderer object
        XYItemRenderer renderer = new XYLineAndShapeRenderer();

        // Use the write method to set base shapes visible
        /* write */ renderer.setBaseShapesVisible(true);

        // Use the read method to get the base shapes visible value
        /* read */ boolean isVisible = renderer.getBaseShapesVisible();

        // Print the result to verify
        System.out.println(isVisible);
    }
}