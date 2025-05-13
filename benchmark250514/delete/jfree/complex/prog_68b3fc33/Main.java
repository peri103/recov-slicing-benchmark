import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem with a dummy shape and label
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Sample Legend", shape, true, true, shape, null);

        // Use the write method to set shape visibility
        /* write */ legendItem.setShapeVisible(true);

        // Additional code to make the program more complex
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        // Initialize another LegendItem and manipulate its properties
        LegendItem anotherLegendItem = new LegendItem("Another Legend", shape, false, true, shape, null);
        anotherLegendItem.setShapeVisible(false);
        legendItems.add(anotherLegendItem);

        // Iterate over the list of legend items and perform operations
        for (LegendItem item : legendItems) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Is shape visible: " + item.isShapeVisible());
        }

        // Perform some calculations unrelated to LegendItems
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Use the read method to check if the shape is visible
        /* read */ boolean isVisible = legendItem.isShapeVisible();

        // Print the result to verify the read method got the correct value
        System.out.println("Shape visibility (original LegendItem): " + isVisible);
    }
}