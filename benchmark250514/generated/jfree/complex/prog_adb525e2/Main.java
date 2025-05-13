import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a list to hold LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();

        // Add some LegendItems to the list
        legendItems.add(new LegendItem("Legend 1"));
        legendItems.add(new LegendItem("Legend 2"));
        legendItems.add(new LegendItem("Legend 3"));

        // Set different colors for each LegendItem
        legendItems.get(0).setFillPaint(Color.BLUE);
        legendItems.get(1).setFillPaint(Color.GREEN);
        legendItems.get(2).setFillPaint(Color.YELLOW);

        // Use the write method to set the fill paint for the main legend item
        /* write */ legendItem.setFillPaint(Color.RED);

        // Perform some operations on the list
        for (LegendItem item : legendItems) {
            System.out.println("Item: " + item.getLabel() + ", Fill Paint: " + item.getFillPaint());
        }

        // More complex operations can be added here
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use the read method to get the fill paint of the main legend item
        /* read */ Paint fillPaint = legendItem.getFillPaint();

        // Print the fill paint to verify
        System.out.println("Main Legend Fill Paint: " + fillPaint);

        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}