import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend", "Sample Description", "Sample ToolTip", "Sample URL", new Rectangle2D.Double(0, 0, 10, 10), null);
        Shape newShape = new Rectangle2D.Double(0, 0, 20, 20);
        /* write */ legendItem.setShape(newShape);
        /* read */ Shape shape = legendItem.getShape();
        System.out.println(shape);
    }
}