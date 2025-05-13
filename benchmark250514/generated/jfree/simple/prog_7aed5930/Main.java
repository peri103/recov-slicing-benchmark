import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape to set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Write operation: set the shape
        /* write */ legendItem.setShape(shape);

        // Read operation: get the shape
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Output the shape to verify
        System.out.println(retrievedShape);
    }
}