import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem with a shape
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Sample Legend", "Description", "ToolTip", "URL", shape, true, null, false, null, false, null, false, null);

        /* write */ legendItem.setShapeVisible(true);
        /* read */ boolean isVisible = legendItem.isShapeVisible();

        System.out.println("Shape visibility: " + isVisible);
    }
}