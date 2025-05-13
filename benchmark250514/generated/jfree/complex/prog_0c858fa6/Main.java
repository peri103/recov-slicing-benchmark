import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Shape instance (Rectangle)
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);

        // Use the write method to set the shape
        /* write */ legendItem.setShape(rectangle);

        // Create a list to store multiple shapes
        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Rectangle2D.Double(0, 0, 20, 20));
        shapesList.add(new Ellipse2D.Double(0, 0, 15, 15));

        // Add the rectangle to the list
        shapesList.add(rectangle);

        // Process the list of shapes
        for (Shape shape : shapesList) {
            System.out.println("Processing shape: " + shape.getBounds());
        }

        // Create another LegendItem and set a different shape
        LegendItem anotherLegendItem = new LegendItem("Another Legend");
        anotherLegendItem.setShape(new Ellipse2D.Double(0, 0, 5, 5));

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Retrieve and print the shape from the original LegendItem
        /* read */ Shape retrievedShape = legendItem.getShape();
        System.out.println("Retrieved shape: " + retrievedShape.getBounds());
    }
}