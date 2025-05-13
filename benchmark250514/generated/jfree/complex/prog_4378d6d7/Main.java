import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem
        LegendItem legendItem = new LegendItem("Sample Item");

        // Use the write method to set the fill paint
        /* write */ legendItem.setFillPaint(Color.RED);

        // Initialize another LegendItem and set some properties
        LegendItem anotherLegendItem = new LegendItem("Another Item");
        anotherLegendItem.setFillPaint(Color.BLUE);
        anotherLegendItem.setOutlinePaint(Color.BLACK);

        // Create a list to hold legend items
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(anotherLegendItem);

        // Iterate over the list and print details of each legend item
        for (LegendItem item : legendItems) {
            Paint outlinePaint = item.getOutlinePaint();
            System.out.println("Outline Paint: " + outlinePaint);
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use the read method to get the fill paint
        /* read */ Paint fillPaint = legendItem.getFillPaint();

        // Print the fill paint to verify the operation
        System.out.println("Fill Paint of Sample Item: " + fillPaint);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}