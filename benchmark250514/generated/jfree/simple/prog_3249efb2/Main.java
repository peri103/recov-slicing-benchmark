import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape object
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Write operation: Set the shape of the LegendItem
        /* write */ legendItem.setShape(shape);

        // Read operation: Get the shape of the LegendItem
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Output the result
        System.out.println("Shape set and retrieved successfully: " + retrievedShape.equals(shape));
    }
}