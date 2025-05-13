import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);
        
        /* write */ legendItem.setShape(rectangle);
        /* read */ Shape shape = legendItem.getShape();
        
        System.out.println(shape);
    }
}