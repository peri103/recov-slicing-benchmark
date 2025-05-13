import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a shape to set
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);

        /* write */ legendItem.setShape(rectangle);
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the shape details to verify it was set and retrieved correctly
        System.out.println(retrievedShape);
    }
}