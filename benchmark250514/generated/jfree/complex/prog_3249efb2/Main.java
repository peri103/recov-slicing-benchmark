import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape object
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Write operation: Set the shape of the LegendItem
        /* write */ legendItem.setShape(shape);

        // Additional unrelated code to increase complexity
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        // Modify the legend item with a different color
        legendItem.setFillPaint(Color.RED);

        // Iterate over legend items and print their properties
        for (LegendItem item : legendItems) {
            System.out.println("Legend Item: " + item.getLabel());
            System.out.println("Color: " + item.getFillPaint());
        }

        // More complex operations
        LegendItem anotherLegendItem = new LegendItem("Another Sample");
        anotherLegendItem.setShape(new Rectangle2D.Double(0, 0, 20, 20));
        legendItems.add(anotherLegendItem);

        for (LegendItem item : legendItems) {
            System.out.println("Shape: " + item.getShape());
        }

        // Read operation: Get the shape of the original LegendItem
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Output the result
        System.out.println("Shape set and retrieved successfully: " + retrievedShape.equals(shape));
    }
}