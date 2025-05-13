import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

public class LegendItemDemo {
    public static void main(String[] args) {
        LegendItemManager manager = new LegendItemManager();

        // Add LegendItems with different shapes
        manager.addLegendItem("Sample 1", new Rectangle2D.Double(0, 0, 10, 10));
        manager.addLegendItem("Sample 2", new Rectangle2D.Double(0, 0, 15, 15));
        manager.addLegendItem("Sample 3", new Rectangle2D.Double(0, 0, 20, 20));

        // Retrieve a specific LegendItem
        LegendItem legendItem = manager.getLegendItem(0);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the retrieved shape to verify
        System.out.println(retrievedShape);
    }
}