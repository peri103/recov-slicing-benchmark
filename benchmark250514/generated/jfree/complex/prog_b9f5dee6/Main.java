import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape to be set
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);

        // Set the shape using the setShape method
        /* write */ legendItem.setShape(rectangle);

        // Create additional LegendItem objects
        LegendItem legendItem2 = new LegendItem("Sample 2");
        LegendItem legendItem3 = new LegendItem("Sample 3");

        // Set shapes for the additional LegendItems
        Shape ellipse = new Ellipse2D.Double(0, 0, 5, 5);
        legendItem2.setShape(ellipse);
        legendItem3.setShape(new Rectangle2D.Double(0, 0, 15, 15));

        // Create a list to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(legendItem2);
        legendItems.add(legendItem3);

        // Perform operations on the list
        for (LegendItem item : legendItems) {
            System.out.println("Legend Item: " + item.getLabel());
        }

        // Retrieve the shape using the getShape method
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the retrieved shape to verify
        System.out.println("Retrieved Shape: " + retrievedShape);

        // Additional operations on shapes
        for (LegendItem item : legendItems) {
            Shape shape = item.getShape();
            System.out.println("Shape bounds: " + shape.getBounds2D());
        }

        // Modify the list by adding a new LegendItem
        LegendItem legendItem4 = new LegendItem("Sample 4");
        legendItem4.setShape(new Ellipse2D.Double(0, 0, 20, 20));
        legendItems.add(legendItem4);

        // Print all LegendItems again
        for (LegendItem item : legendItems) {
            System.out.println("Updated Legend Item: " + item.getLabel());
        }
    }
}