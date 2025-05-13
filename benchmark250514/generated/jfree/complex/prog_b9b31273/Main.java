import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LegendItem
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape to be set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Use the write method to set the shape
        /* write */ legendItem.setShape(shape);

        // Create another LegendItem with a different shape
        LegendItem anotherLegendItem = new LegendItem("Another Sample", Color.RED);
        Shape anotherShape = new Rectangle2D.Double(0, 0, 20, 20);
        anotherLegendItem.setShape(anotherShape);

        // Create a list to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(anotherLegendItem);

        // Iterate over the list and print details of each LegendItem
        for (LegendItem item : legendItems) {
            System.out.println("LegendItem: " + item.getLabel() + ", Color: " + item.getFillPaint());
        }

        // Some unrelated computation
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 99: " + sum);

        // Use the read method to get the shape
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the shape to verify
        System.out.println("Retrieved Shape: " + retrievedShape);

        // Further unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}