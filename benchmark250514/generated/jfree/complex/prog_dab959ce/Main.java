import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a Shape object to be used in the write method
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Write operation: set the shape of the LegendItem
        /* write */ legendItem.setShape(shape);

        // Perform additional operations to increase complexity
        List<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        // Create another LegendItem and modify its properties
        LegendItem anotherLegendItem = new LegendItem("Another Sample");
        anotherLegendItem.setShape(new Rectangle2D.Double(0, 0, 5, 5));
        anotherLegendItem.setFillPaint(Color.RED);

        // Add the second LegendItem to the list
        legendItems.add(anotherLegendItem);

        // Iterate through the list and perform operations
        for (LegendItem item : legendItems) {
            System.out.println("Legend Item: " + item.getLabel());
            System.out.println("Shape: " + item.getShape());
            System.out.println("Paint: " + item.getFillPaint());
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read operation: retrieve the shape from the original LegendItem
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Output the result to verify correctness
        System.out.println("Retrieved Shape: " + retrievedShape);
    }
}