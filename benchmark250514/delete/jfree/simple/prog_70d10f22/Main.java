import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem object
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Example", shape);

        // Write operation: Set shape visibility to true
        /* write */ legendItem.setShapeVisible(true);

        // Read operation: Check if the shape is visible
        /* read */ boolean isVisible = legendItem.isShapeVisible();

        // Print the result
        System.out.println("Is shape visible: " + isVisible);
    }
}