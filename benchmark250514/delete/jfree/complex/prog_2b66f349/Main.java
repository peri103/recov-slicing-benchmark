import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize shape and LegendItem
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10); // Example shape
        LegendItem legendItem = new LegendItem("Example", null, null, null, shape, null);

        // Set the shape visibility
        /* write */ legendItem.setShapeVisible(true);

        // Additional complex operations
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        
        // Create another LegendItem with different properties
        LegendItem anotherLegendItem = new LegendItem("Another Example", null, null, null, shape, Color.RED);
        anotherLegendItem.setShapeVisible(false);
        legendItems.add(anotherLegendItem);

        // Process the list of legend items
        for (LegendItem item : legendItems) {
            System.out.println("Legend Item: " + item.getLabel() + ", Shape Visible: " + item.isShapeVisible());
        }

        // Modify properties of the first item in the list
        LegendItem firstItem = legendItems.get(0);
        firstItem.setLabel("Updated Example");
        firstItem.setFillPaint(Color.BLUE);

        // Further operations
        double totalWidth = 0.0;
        for (LegendItem item : legendItems) {
            Shape itemShape = item.getShape();
            if (itemShape instanceof Rectangle2D) {
                Rectangle2D rect = (Rectangle2D) itemShape;
                totalWidth += rect.getWidth();
            }
        }

        System.out.println("Total width of all shapes: " + totalWidth);

        // Check visibility again
        /* read */ boolean isVisible = legendItem.isShapeVisible();
        System.out.println("Final visibility of the first legend item: " + isVisible);
    }
}