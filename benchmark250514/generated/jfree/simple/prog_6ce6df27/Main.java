import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a shape object to set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        /* write */ legendItem.setShape(shape);

        /* read */ Shape readShape = legendItem.getShape();

        // Print the shape to verify
        System.out.println(readShape);
    }
}