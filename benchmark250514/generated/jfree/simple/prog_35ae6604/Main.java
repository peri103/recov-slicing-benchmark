import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Example");

        // Create a shape to be set
        Shape circle = new Ellipse2D.Double(0, 0, 10, 10);

        /* write */ legendItem.setShape(circle);

        /* read */ Shape retrievedShape = legendItem.getShape();

        // Output the class of the shape to verify it was set and retrieved correctly
        System.out.println(retrievedShape.getClass().getName());
    }
}