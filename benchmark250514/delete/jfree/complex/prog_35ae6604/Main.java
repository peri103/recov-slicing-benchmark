import org.jfree.chart.LegendItem;
import org.jfree.chart.title.LegendTitle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Example");

        // Create a shape to be set
        Shape circle = new Ellipse2D.Double(0, 0, 10, 10);

        /* write */ legendItem.setShape(circle);

        // Create another LegendItem and set a different shape
        LegendItem anotherLegendItem = new LegendItem("Another Example");
        Shape rectangle = new Rectangle2D.Double(0, 0, 20, 10);
        anotherLegendItem.setShape(rectangle);

        // Initialize a list to hold LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(anotherLegendItem);

        // Create a LegendTitle using the list of LegendItems
        LegendTitle legendTitle = new LegendTitle(null);
        legendTitle.setLegendItems(legendItems);

        // Iterate over legendItems and print their shapes
        for (LegendItem item : legendItems) {
            Shape itemShape = item.getShape();
            System.out.println("LegendItem shape: " + itemShape.getClass().getName());
        }

        // Additional operations to make the program more complex
        int totalShapes = 0;
        for (LegendItem item : legendItems) {
            if (item.getShape() instanceof Ellipse2D) {
                totalShapes += 1;
            }
        }
        System.out.println("Total Ellipse2D shapes: " + totalShapes);

        /* read */ Shape retrievedShape = legendItem.getShape();

        // Output the class of the shape to verify it was set and retrieved correctly
        System.out.println("Retrieved shape: " + retrievedShape.getClass().getName());
    }
}