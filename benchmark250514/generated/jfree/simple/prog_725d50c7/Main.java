import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape to set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        /* write */ legendItem.setShape(shape);

        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the retrieved shape to verify
        System.out.println(retrievedShape);
    }
}