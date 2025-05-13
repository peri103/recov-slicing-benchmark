import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the renderer
        XYItemRenderer renderer = new XYLineAndShapeRenderer();

        // Write operation: Set base shapes visible to true
        /* write */ renderer.setBaseShapesVisible(true);

        // Read operation: Get the value of base shapes visible
        /* read */ boolean isBaseShapesVisible = renderer.getBaseShapesVisible();

        // Output the result
        System.out.println("Base shapes visible: " + isBaseShapesVisible);
    }
}