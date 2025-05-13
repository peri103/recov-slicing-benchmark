import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Set the line paint color using the write method
        /* write */ legendItem.setLinePaint(Color.RED);

        // Create an ArrayList to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();

        // Add the LegendItem to the list
        legendItems.add(legendItem);

        // Create another LegendItem and set its properties
        LegendItem anotherLegendItem = new LegendItem("Another Legend");
        anotherLegendItem.setLinePaint(Color.BLUE);
        legendItems.add(anotherLegendItem);

        // Iterate over the list and print details
        for (LegendItem item : legendItems) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Line Paint: " + item.getLinePaint());
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Read the line paint color using the read method
        /* read */ Color linePaint = (Color) legendItem.getLinePaint();

        // Print the read value to verify
        System.out.println("Line Paint Color: " + linePaint);
    }
}