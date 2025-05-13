import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Test Legend", shape, true, null, null, null);

        /* write */ legendItem.setShapeVisible(true);

        // Additional complexity: Managing multiple LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        LegendItem anotherLegendItem = new LegendItem("Another Legend", shape, false, null, null, null);
        legendItems.add(anotherLegendItem);

        // Manipulate anotherLegendItem
        anotherLegendItem.setShapeVisible(false);
        anotherLegendItem.setFillPaint(Color.RED);

        // Process LegendItems
        for (LegendItem item : legendItems) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Shape visible: " + item.isShapeVisible());
            System.out.println("Fill color: " + item.getFillPaint());
        }

        // More unrelated code for complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ boolean isVisible = legendItem.isShapeVisible();
        System.out.println("Shape visible: " + isVisible);
    }
}