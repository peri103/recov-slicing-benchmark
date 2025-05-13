import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        // Initialize LegendItem with dummy values
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Legend", "Description", "ToolTip", "URL", true, shape, true, null, false, null, false, null, false, null);

        /* write */ legendItem.setShapeVisible(true);
        
        /* read */ boolean isShapeVisible = legendItem.isShapeVisible();
        
        System.out.println("Is shape visible: " + isShapeVisible);
    }
}