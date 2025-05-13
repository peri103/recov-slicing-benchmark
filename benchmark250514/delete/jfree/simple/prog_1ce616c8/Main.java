import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Ellipse2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Sample Item", null, null, null, shape, true, null, false, null, false, null, false, null, false);
        
        /* write */ legendItem.setShapeVisible(true);
        /* read */ boolean isVisible = legendItem.isShapeVisible();
        
        System.out.println("Shape visibility: " + isVisible);
    }
}