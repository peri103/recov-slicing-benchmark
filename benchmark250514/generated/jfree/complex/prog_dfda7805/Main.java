import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Additional LegendItem instances for complexity
        LegendItem legendItem2 = new LegendItem("Another Legend");
        LegendItem legendItem3 = new LegendItem("Third Legend");

        // Set fill paint for the additional LegendItem instances
        legendItem2.setFillPaint(Color.BLUE);
        legendItem3.setFillPaint(Color.GREEN);

        // Create a collection to store LegendItem objects
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(legendItem2);
        legendItems.add(legendItem3);

        // Perform operations on the collection
        for (LegendItem item : legendItems) {
            System.out.println("Legend: " + item.getLabel());
        }

        // Set the fill paint using the write method
        /* write */ legendItem.setFillPaint(Color.RED);

        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the fill paint using the read method
        /* read */ Paint fillPaint = legendItem.getFillPaint();

        // Print the fill paint to verify
        System.out.println(fillPaint);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}