import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Create LegendItemWrapper instance and set shape
        LegendItemWrapper legendItemWrapper = new LegendItemWrapper("Sample");
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        legendItemWrapper.setShape(shape);

        // Perform complex operations
        ComplexOperations complexOps = new ComplexOperations();
        for (int i = 0; i < 100; i++) {
            complexOps.addNumber(i);
        }
        int sum = complexOps.computeSum();
        System.out.println("Sum of numbers from 0 to 99: " + sum);

        int product = complexOps.computeProduct();
        System.out.println("Product of numbers from 1 to 99: " + product);

        // Retrieve shape using LegendItemWrapper
        /* read */ Shape retrievedShape = legendItemWrapper.getShape();
        System.out.println("Retrieved Shape: " + retrievedShape);
    }
}