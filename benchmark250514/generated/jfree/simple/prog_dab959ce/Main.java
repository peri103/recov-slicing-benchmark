import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a Shape object to be used in the write method
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Write operation: set the shape of the LegendItem
        /* write */ legendItem.setShape(shape);

        // Read operation: retrieve the shape from the LegendItem
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Output the result to verify correctness
        System.out.println(retrievedShape);
    }
}