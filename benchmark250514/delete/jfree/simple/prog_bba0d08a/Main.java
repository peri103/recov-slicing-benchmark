import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the renderer object
        XYItemRenderer renderer = new StandardXYItemRenderer();

        // Write operation: set the base shapes visibility to true
        /* write */ renderer.setBaseShapesVisible(true);

        // Read operation: get the base shapes visibility
        /* read */ boolean isVisible = renderer.getBaseShapesVisible();

        // Print the value to verify the read operation
        System.out.println(isVisible);
    }
}