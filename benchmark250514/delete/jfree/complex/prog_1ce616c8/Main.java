import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Ellipse2D.Double(0, 0, 10, 10);
        Shape shape2 = new Rectangle2D.Double(0, 0, 20, 20);
        
        LegendItem legendItem1 = new LegendItem("Sample Item 1", null, null, null, shape1, true, null, false, null, false, null, false, null, false);
        LegendItem legendItem2 = new LegendItem("Sample Item 2", null, null, null, shape2, false, null, false, null, false, null, false, null, false);
        
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem1);
        legendItems.add(legendItem2);
        
        /* write */ legendItem1.setShapeVisible(true);
        
        for (LegendItem item : legendItems) {
            System.out.println("LegendItem: " + item.getLabel());
            System.out.println("Shape: " + item.getShape().getBounds());
            System.out.println("Shape visible: " + item.isShapeVisible());
        }
        
        // Modify the second legend item
        legendItem2.setShapeVisible(true);
        legendItem2.setLineVisible(true);
        
        // Add some logic to process these items
        for (LegendItem item : legendItems) {
            if (item.isShapeVisible()) {
                System.out.println(item.getLabel() + " has a visible shape.");
            } else {
                System.out.println(item.getLabel() + " has an invisible shape.");
            }
        }
        
        /* read */ boolean isVisible = legendItem1.isShapeVisible();
        System.out.println("Shape visibility of legendItem1: " + isVisible);
    }
}