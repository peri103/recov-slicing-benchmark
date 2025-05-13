import org.jfree.chart.LegendItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initial setup for LegendItem
        LegendItem legendItem = new LegendItem("Initial Label");

        // Create a list to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        // Add some unrelated operations
        for (int i = 0; i < 3; i++) {
            LegendItem item = new LegendItem("Item " + i);
            legendItems.add(item);
        }

        // Update the label of the first legend item
        /* write */ legendItem.setLabel("Updated Label");

        // Perform some operations on the list
        for (LegendItem item : legendItems) {
            System.out.println("LegendItem: " + item.getLabel());
        }

        // Add more complexity with some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Conditional logic
        if (sum > 10) {
            System.out.println("The sum is greater than 10.");
        } else {
            System.out.println("The sum is 10 or less.");
        }

        // Retrieve the updated label
        /* read */ String label = legendItem.getLabel();
        System.out.println("Updated LegendItem label: " + label);

        // Additional operations on the list
        for (int i = 0; i < legendItems.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("Even indexed item: " + legendItems.get(i).getLabel());
            }
        }
    }
}