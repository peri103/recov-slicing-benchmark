import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Shape instance (Rectangle)
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);

        // Use the write method to set the shape
        /* write */ legendItem.setShape(rectangle);

        // Use the read method to get the shape
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the retrieved shape to verify the operation
        System.out.println(retrievedShape);
    }
}