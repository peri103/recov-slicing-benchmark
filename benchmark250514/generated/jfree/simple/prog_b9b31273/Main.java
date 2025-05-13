import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LegendItem
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape to be set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Use the write method to set the shape
        /* write */ legendItem.setShape(shape);

        // Use the read method to get the shape
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the shape to verify
        System.out.println(retrievedShape);
    }
}