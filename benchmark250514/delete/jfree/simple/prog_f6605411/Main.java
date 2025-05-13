import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Test Legend", shape, true, null, null, null);

        /* write */ legendItem.setShapeVisible(true);
        /* read */ boolean isVisible = legendItem.isShapeVisible();

        System.out.println("Shape visible: " + isVisible);
    }
}