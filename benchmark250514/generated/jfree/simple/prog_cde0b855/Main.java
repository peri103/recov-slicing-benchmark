import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Item");
        
        // Create a shape to set
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);
        
        /* write */ legendItem.setShape(rectangle);
        
        /* read */ Shape shape = legendItem.getShape();
        
        // Output the shape to verify
        System.out.println(shape);
    }
}