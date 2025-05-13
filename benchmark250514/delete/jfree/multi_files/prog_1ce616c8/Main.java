import org.jfree.chart.LegendItem;
import java.awt.geom.Ellipse2D;
import java.awt.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Ellipse2D.Double(0, 0, 10, 10);
        LegendItem legendItem1 = new LegendItem("Sample Item 1", null, null, null, shape1, true, null, false, null, false, null, false, null, false);

        LegendManager legendManager = new LegendManager();
        legendManager.addLegendItem(legendItem1);

        LegendItemVisibility visibilityController = new LegendItemVisibility(legendManager.getLegendItem(0));
        visibilityController.setVisibility(true);

        // Add extra logic to process the legend items
        for (LegendItem item : legendManager.getLegendItems()) {
            System.out.println("LegendItem: " + item.getLabel());
            System.out.println("Shape visible: " + item.isShapeVisible());
        }

        /* read */ boolean isVisible = visibilityController.getVisibility();
        System.out.println("Shape visibility of legendItem1: " + isVisible);
    }
}