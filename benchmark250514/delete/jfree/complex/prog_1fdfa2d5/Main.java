import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem with a shape
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Sample Legend", "Description", "ToolTip", "URL", shape, true, null, false, null, false, null, false, null);

        // Additional complexity: Create another LegendItem and modify its properties
        LegendItem anotherLegendItem = new LegendItem("Another Legend", "Another Description", "Another ToolTip", "Another URL", shape, false, Color.RED, true, Color.BLUE, true, Color.GREEN, true, Color.YELLOW);
        anotherLegendItem.setLabelPaint(Color.MAGENTA);
        anotherLegendItem.setLineVisible(true);

        // Additional complexity: Store LegendItems in a list
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(anotherLegendItem);

        // Perform some operations on the list
        for (LegendItem item : legendItems) {
            System.out.println("Legend: " + item.getLabel());
        }

        /* write */ legendItem.setShapeVisible(true);

        // More operations with the list
        for (LegendItem item : legendItems) {
            item.setShapeVisible(false); // Modify visibility for all items in the list
        }

        // Separate operations on anotherLegendItem
        anotherLegendItem.setShapeVisible(true);
        boolean anotherVisibility = anotherLegendItem.isShapeVisible();
        System.out.println("Another Legend shape visibility: " + anotherVisibility);

        /* read */ boolean isVisible = legendItem.isShapeVisible();

        System.out.println("Shape visibility: " + isVisible);

        // Additional complexity: Modify and read more properties
        legendItem.setLabelPaint(Color.ORANGE);
        Color labelColor = legendItem.getLabelPaint();
        System.out.println("Legend label color: " + labelColor);
    }
}