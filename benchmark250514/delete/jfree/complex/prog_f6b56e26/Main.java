import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        LegendItem legendItem = new LegendItem("Sample", shape, true, null, null, null, null);
        
        // Additional LegendItem with different properties
        LegendItem anotherLegendItem = new LegendItem("Another Sample", shape, false, null, Color.RED, null, null);
        
        // ArrayList to store LegendItems
        ArrayList<LegendItem> legendItemList = new ArrayList<>();
        legendItemList.add(legendItem);
        legendItemList.add(anotherLegendItem);
        
        // Perform operations on the list
        for (LegendItem item : legendItemList) {
            System.out.println("Legend Item: " + item.getLabel());
        }
        
        /* write */ legendItem.setShapeVisible(true);
        
        // Modify anotherLegendItem and check its visibility
        anotherLegendItem.setShapeVisible(false);
        boolean anotherVisibility = anotherLegendItem.isShapeVisible();
        System.out.println("Another Legend Item visibility: " + anotherVisibility);
        
        // Perform operations unrelated to LegendItem
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* read */ boolean isVisible = legendItem.isShapeVisible();
        System.out.println("Shape visibility: " + isVisible);
        
        // More complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}