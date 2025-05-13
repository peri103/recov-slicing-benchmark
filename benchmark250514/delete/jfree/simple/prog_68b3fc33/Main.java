import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem with a dummy shape and label
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Sample Legend", shape, true, true, shape, null);

        // Use the write method to set shape visibility
        /* write */ legendItem.setShapeVisible(true);

        // Use the read method to check if the shape is visible
        /* read */ boolean isVisible = legendItem.isShapeVisible();

        // Print the result to verify the read method got the correct value
        System.out.println("Shape visibility: " + isVisible);
    }
}