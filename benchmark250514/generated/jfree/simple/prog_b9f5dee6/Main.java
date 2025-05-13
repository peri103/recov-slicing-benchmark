import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape to be set
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);

        // Set the shape using the setShape method
        /* write */ legendItem.setShape(rectangle);

        // Retrieve the shape using the getShape method
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the retrieved shape to verify
        System.out.println(retrievedShape);
    }
}