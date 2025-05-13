import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

public class Main {
    public static void main(String[] args) {
        // Initialize LegendShapeManager
        LegendShapeManager legendManager = new LegendShapeManager("Sample Legend");

        // Create a Shape instance (Rectangle)
        Rectangle2D rectangle = new Rectangle2D.Double(0, 0, 10, 10);

        // Set the shape using LegendShapeManager
        legendManager.setLegendShape(rectangle);

        // Initialize ShapeProcessor
        ShapeProcessor shapeProcessor = new ShapeProcessor();

        // Add shapes to ShapeProcessor
        shapeProcessor.addShape(new Rectangle2D.Double(0, 0, 20, 20));
        shapeProcessor.addShape(new Ellipse2D.Double(0, 0, 15, 15));
        shapeProcessor.addShape(rectangle);

        // Process the shapes
        shapeProcessor.processShapes();

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Retrieve and print the shape from LegendShapeManager
        /* read */ Shape retrievedShape = legendManager.getLegendShape();
        System.out.println("Retrieved shape: " + retrievedShape.getBounds());
    }
}